package com.code.demo;

import java.util.List;

public class Followers {
    List<Follower> followers;
    transient String userId ;
    transient Integer counter=0;

    public Followers(String userId) {
        this.userId = userId;
        this.counter = 0;
    }

    public Followers(String userId, Integer counter) {
        this.userId = userId;
        this.counter = counter;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
    public void incrementCounter() {
        this.counter ++;
    }
}
