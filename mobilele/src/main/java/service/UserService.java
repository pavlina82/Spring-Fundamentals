package service;

import model.dto.UserLoginDTO;
import model.dto.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);

    boolean loginUser(UserLoginDTO userLoginDTO);

    void logoutUser();

}
