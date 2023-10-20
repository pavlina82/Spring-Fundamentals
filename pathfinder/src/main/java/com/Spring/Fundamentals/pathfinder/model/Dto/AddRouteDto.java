package com.Spring.Fundamentals.pathfinder.model.Dto;

import com.Spring.Fundamentals.pathfinder.model.Categories;
import com.Spring.Fundamentals.pathfinder.model.Enums.CategoryName;
import com.Spring.Fundamentals.pathfinder.model.Enums.Level;

import java.util.Set;

public class AddRouteDto {
    private String name;
    private String description;
    //    private String gpxCoordinates;
    private Level level;
    private String videoUrl;
    private Set<CategoryName> categories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Set<CategoryName> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryName> categories) {
        this.categories = categories;
    }
}
