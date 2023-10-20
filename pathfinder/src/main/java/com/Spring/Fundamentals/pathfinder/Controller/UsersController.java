package com.Spring.Fundamentals.pathfinder.Controller;


import com.Spring.Fundamentals.pathfinder.Service.AuthenticationService;
import com.Spring.Fundamentals.pathfinder.model.Dto.UserLoginDto;
import com.Spring.Fundamentals.pathfinder.model.Dto.UserRegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final AuthenticationService authenticationService;

    public UsersController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    @PostMapping("/login")
    public ModelAndView login(UserLoginDto userLoginDto) {
        boolean isLogged = authenticationService.login(userLoginDto);

        if (isLogged) {
            return new ModelAndView("redirect:/");
        }

        return new ModelAndView("login");
    }
    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }
    @PostMapping ("/register")
    public ModelAndView register(UserRegisterDto userRegisterDto) {
        this.authenticationService.register(userRegisterDto);
        return new ModelAndView("redirect:login");
    }
    @GetMapping("/logout")
    public ModelAndView logout(){
        this.authenticationService.logout();
        return new ModelAndView("redirect");
    }
}
