package com.Spring.Fundamentals.pathfinder.Service.impl;

import com.Spring.Fundamentals.pathfinder.Service.AuthenticationService;
import com.Spring.Fundamentals.pathfinder.Service.session.LoggedUser;
import com.Spring.Fundamentals.pathfinder.model.Dto.UserLoginDto;
import com.Spring.Fundamentals.pathfinder.model.Dto.UserRegisterDto;
import com.Spring.Fundamentals.pathfinder.model.User;
import com.Spring.Fundamentals.pathfinder.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final LoggedUser loggedUser;

    public AuthenticationServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.loggedUser = loggedUser;
    }

    @Override
    public void register(UserRegisterDto userRegisterDto) {
        User user = modelMapper.map(userRegisterDto, User.class);
        user.setPassword(passwordEncoder.encode(userRegisterDto.getPassword()));
        userRepository.save(user);

    }
    @Override
    public boolean login(UserLoginDto userLoginDto) {
        String username = userLoginDto.getUserName();
        User user = this.userRepository.findByUserName(username);

        if (user == null) {
            throw new IllegalArgumentException("User with that username: " + username + " is not present");
        }

        boolean passwordMatch = passwordEncoder.matches(userLoginDto.getPassword(), user.getPassword());

        if (!passwordMatch) {
            throw new IllegalArgumentException("User entered incorrect password");
        }

        loggedUser.setUserName(user.getUserName());
        loggedUser.setEmail(user.getEmail());
        loggedUser.setFullName(user.getFullName());
        loggedUser.setLogged(true);

        return passwordMatch;
    }
    @Override
    public void logout() {
        loggedUser.reset();
    }
}
