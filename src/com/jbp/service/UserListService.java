package com.jbp.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.jbp.meta.UsersMeta;
import com.jbp.model.Users;


public class UserListService {
    private UsersMeta t = new UsersMeta();
    
    public List<Users> getUserList(){
        return Datastore.query(t).sort(t.userName.asc).asList();
    }
}
