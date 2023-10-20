package com.Spring.Fundamentals.pathfinder.Controller;

import com.Spring.Fundamentals.pathfinder.Service.RouteService;
import com.Spring.Fundamentals.pathfinder.model.Dto.AddRouteDto;
import com.Spring.Fundamentals.pathfinder.model.Enums.CategoryName;
import com.Spring.Fundamentals.pathfinder.model.Enums.Level;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/routes")
public class RoutesController {

    private final RouteService routeService;

    public RoutesController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/add")
    public ModelAndView addRoute() {
        ModelAndView modelAndView = new ModelAndView("add-route");
        modelAndView.addObject("levels", Level.values());
        modelAndView.addObject("categories", CategoryName.values());
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView addRoute(AddRouteDto addRouteDto) {
        routeService.add(addRouteDto);
        return new ModelAndView("redirect:/");
    }
}
