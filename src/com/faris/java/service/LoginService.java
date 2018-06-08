package com.faris.java.service;

import com.faris.java.dto.User;

import java.util.HashMap;

public class LoginService {

    HashMap<String, String> users = new HashMap<String, String>();

    public LoginService() {
        users.put("johndoe", "John Doe");
        users.put("jono", "Jhono");
        users.put("admin", "admin");
    }

    public boolean authenticate(String userId, String password)
    {
        if(password == null || password.trim() == ""){
            return false;
        }
        return true;
    }

    public User getUserDetails(String userId){

        User user = new User();
        user.setUserName(users.get(userId));
        user.setUserId(userId);

        return user;

    }
}
