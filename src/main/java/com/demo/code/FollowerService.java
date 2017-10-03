package com.code.demo;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Service
public class FollowerService {

    private  Client client = ClientBuilder.newClient();

    public  Followers fetchFollowers(String userId) {

        Followers followers = new Followers(userId);
        fetchFollowers(followers) ;
        return followers;
    }


    public  void fetchFollowers(Followers followers) {

        if (followers.getCounter() >= 3)
            return ;

        String userId = followers.getUserId();
        client = ClientBuilder.newClient();
        WebTarget target = client.target(String.format("https://api.github.com/users/%s/followers",userId));
        List<Follower> list = target.request(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<Follower>>(){});

        if (list.size() > 5)
            list = list.subList(0,5);

        followers.setFollowers(list);
        for (Follower follower: followers.getFollowers()) {
                Followers childFollower = new Followers(follower.getLogin(),followers.getCounter()+1) ;
                follower.setChild(childFollower);
                fetchFollowers(childFollower) ;
        }

    }

    public static void  main(String[] arg) throws Exception{
        FollowerService service = new FollowerService();
        Followers followers = new Followers("octocat");
        service.fetchFollowers(followers) ;
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(followers);
        System.out.print(jsonStr);
    }
}
