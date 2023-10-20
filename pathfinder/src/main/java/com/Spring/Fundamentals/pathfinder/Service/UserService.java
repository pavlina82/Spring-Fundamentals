package com.Spring.Fundamentals.pathfinder.Service;

import com.Spring.Fundamentals.pathfinder.model.Dto.UserLoginDto;
import com.Spring.Fundamentals.pathfinder.model.Dto.UserRegisterDto;
import com.Spring.Fundamentals.pathfinder.model.User;

public interface UserService {

    User getLoggedUser();

}
