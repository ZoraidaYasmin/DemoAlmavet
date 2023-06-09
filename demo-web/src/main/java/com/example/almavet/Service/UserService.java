package com.example.almavet.Service;

import com.example.almavet.Entity.User;

public interface UserService {

    public boolean findByUsernameAndPassword(String username, String password);
}
