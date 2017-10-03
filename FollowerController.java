package com.code.demo;

/*import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@RestController
public class FollowerController {

    @Autowired
    private FollowerService followerService;

    @RequestMapping(value="/follower/{userId}", method=RequestMethod.GET)
    @Produces(MediaType.APPLICATION_JSON)
    public Followers userFollower(final @PathVariable("userId") String userId)
    {
        //if(validate(userId))
        return followerService.fetchFollowers(userId) ;
      
    }

}
