package com.Spring.Fundamentals.pathfinder.Service.impl;

import com.Spring.Fundamentals.pathfinder.Service.RestDemoService;
import com.Spring.Fundamentals.pathfinder.model.User;
import com.Spring.Fundamentals.pathfinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestDemoServiceImpl implements RestDemoService {

    private UserRepository userRepository;

    @Autowired
    public RestDemoServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
