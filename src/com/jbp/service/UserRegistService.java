package com.jbp.service;

import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;
import com.jbp.model.Users;


public class UserRegistService {
    
    
    public Users addUser(Map<String, Object> input){
        Users user = new Users();
        
        BeanUtil.copy(input, user);
//        Key key = Datastore.createKey(Users.class, "com.jbp.users");
//        user.setUserId(key);
//        user.setCountry("aaa");
//        user.setUserName("name");
        
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(user);
        tx.commit();
        
        return user;

    }
}
