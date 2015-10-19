package org.service;

/**
 * Created by sector7 on 10/19/15.
 */


import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {


    @GET
    @Path("/users")
    @Produces("text/plain")
    public List<Integer> getUsers() {

        List<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            lst.add(i);
        }
        return lst;
    }
}