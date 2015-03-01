package com.infosupport.jee.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/tweets")
public class TweetResource {
    @GET
    @Produces("text/plain")
    public String getTweets() {
        return "tweets";
    }
    
    @GET
    @Path("{id}")
    @Produces("text/plain")
    public String getTweet(@PathParam("id") String id) {
        return "a tweet";
    }
}
