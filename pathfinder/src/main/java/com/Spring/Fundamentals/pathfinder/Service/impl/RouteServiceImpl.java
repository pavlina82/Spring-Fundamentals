package com.Spring.Fundamentals.pathfinder.Service.impl;

import com.Spring.Fundamentals.pathfinder.Service.RouteService;
import com.Spring.Fundamentals.pathfinder.Service.UserService;
import com.Spring.Fundamentals.pathfinder.model.Categories;
import com.Spring.Fundamentals.pathfinder.model.Dto.AddRouteDto;
import com.Spring.Fundamentals.pathfinder.model.Route;
import com.Spring.Fundamentals.pathfinder.model.User;
import com.Spring.Fundamentals.pathfinder.repository.CategoriesRepository;
import com.Spring.Fundamentals.pathfinder.repository.RouteRepository;
import jdk.jfr.Category;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final CategoriesRepository categoriesRepository;
    private final UserService userService;
    private final ModelMapper modelMapper;

    public RouteServiceImpl(RouteRepository routeRepository, CategoriesRepository categoriesRepository, UserService userService, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.categoriesRepository = categoriesRepository;

        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(AddRouteDto addRouteDto) {

        Route route = modelMapper.map(addRouteDto,Route.class);
        route.getCategories().clear();
        Set<Categories> categories = categoriesRepository.findByNameIn(addRouteDto.getCategories());
        route.addCategories(categories);

        User user = userService.getLoggedUser();
        route.setAuthor(user);

        routeRepository.save(route);
    }
}
