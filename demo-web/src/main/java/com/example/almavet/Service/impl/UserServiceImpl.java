package com.example.almavet.Service.impl;

import com.example.almavet.Entity.User;
import com.example.almavet.Repository.UserRepository;
import com.example.almavet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean findByUsernameAndPassword(String username, String password) {

        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
