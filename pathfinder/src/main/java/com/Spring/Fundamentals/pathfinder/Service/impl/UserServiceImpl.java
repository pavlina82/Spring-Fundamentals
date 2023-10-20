package com.Spring.Fundamentals.pathfinder.Service.impl;

import com.Spring.Fundamentals.pathfinder.Service.UserService;
import com.Spring.Fundamentals.pathfinder.Service.session.LoggedUser;
import com.Spring.Fundamentals.pathfinder.model.User;
import com.Spring.Fundamentals.pathfinder.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final LoggedUser loggedUser;

    public UserServiceImpl(UserRepository userRepository, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.loggedUser = loggedUser;
    }


    @Override
    public User getLoggedUser() {
        return userRepository.findByUserName(loggedUser.getUserName());
    }
}
