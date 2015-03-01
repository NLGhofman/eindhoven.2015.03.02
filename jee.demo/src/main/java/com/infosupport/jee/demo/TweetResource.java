package com.infosupport.jee.demo;

import javax.ws.rs.*;

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
    
    @DELETE
    @Path("{id}")
    public void deleteTweet(@PathParam("id") String id) {
        /* delete tweet with id */
    }
}
