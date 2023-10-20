package com.Spring.Fundamentals.pathfinder.Service;

import com.Spring.Fundamentals.pathfinder.model.Dto.UserLoginDto;
import com.Spring.Fundamentals.pathfinder.model.Dto.UserRegisterDto;

public interface AuthenticationService {
    void register(UserRegisterDto userRegisterDto);

    boolean login(UserLoginDto userLoginDto);

    void logout();
}
