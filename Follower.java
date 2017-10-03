package com.code.demo;

public class Follower {

    String login;
    transient Long id;
    transient String avatar_url;
    transient String gravatar_id;
    transient String url;
    transient String html_url;
    transient String followers_url;
    transient String following_url;
    transient String gists_url;
    transient String starred_url;
    transient String subscriptions_url;
    transient String organizations_url;
    transient String repos_url;
    transient String events_url;
    transient String received_events_url;
    transient String type;
    transient Boolean site_admin;

    Followers child;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(Boolean site_admin) {
        this.site_admin = site_admin;
    }

    public Followers getChild() {
        return child;
    }

    public void setChild(Followers child) {
        this.child = child;
    }
/*
login: "myhduck",
id: 1555350,
avatar_url: "https://avatars2.githubusercontent.com/u/1555350?v=4",
gravatar_id: "",
url: "https://api.github.com/users/myhduck",
html_url: "https://github.com/myhduck",
followers_url: "https://api.github.com/users/myhduck/followers",
following_url: "https://api.github.com/users/myhduck/following{/other_user}",
gists_url: "https://api.github.com/users/myhduck/gists{/gist_id}",
starred_url: "https://api.github.com/users/myhduck/starred{/owner}{/repo}",
subscriptions_url: "https://api.github.com/users/myhduck/subscriptions",
organizations_url: "https://api.github.com/users/myhduck/orgs",
repos_url: "https://api.github.com/users/myhduck/repos",
events_url: "https://api.github.com/users/myhduck/events{/privacy}",
received_events_url: "https://api.github.com/users/myhduck/received_events",
type: "User",
site_admin: false
 */
}
