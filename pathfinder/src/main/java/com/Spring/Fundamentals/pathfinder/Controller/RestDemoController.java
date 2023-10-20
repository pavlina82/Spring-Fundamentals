package com.Spring.Fundamentals.pathfinder.Controller;


import com.Spring.Fundamentals.pathfinder.Service.RestDemoService;
import com.Spring.Fundamentals.pathfinder.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestDemoController {

    private final RestDemoService restDemoService;

    public RestDemoController(RestDemoService restDemoService) {
        this.restDemoService = restDemoService;
    }
//    @RequestMapping(path = "/users/all", method = RequestMethod.GET)
    @GetMapping("/users/all")
    public List<User> getAll(){
        return this.restDemoService.getAll();
    }
}
