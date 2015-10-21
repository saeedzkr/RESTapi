package org.service;

/**
 * Created by sector7 on 10/19/15.
 */


import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;

@Path("/UserService")
public class UserService {


    @GET
    @Path("/users")
    @Produces("application/xml")
    public List<String> getUsers(@QueryParam("username") String user) {

        List<String> lst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            lst.add(user);

        }
        return lst;

    }
}