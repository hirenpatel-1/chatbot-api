package com.bs.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.bs.rest.model.ContentMatch;
import com.bs.rest.service.BotService;

@Path("/bot")
public class BotApi {

    @GET
    @Produces("application/json")
    public ContentMatch getProductInJSON(@QueryParam("content") String content) {
        BotService bs = new BotService();
        return bs.match(content);
    }

}