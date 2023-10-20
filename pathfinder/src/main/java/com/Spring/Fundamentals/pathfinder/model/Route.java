package com.Spring.Fundamentals.pathfinder.model;

import com.Spring.Fundamentals.pathfinder.model.Enums.Level;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "routes")
public class Route extends BaseEntity {


    @Column(name = "description",columnDefinition = "TEXT",nullable = false)
    private String description;

    @Column(name = "gpx_coordinates",columnDefinition = "LONGTEXT")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    @Column(name = "level_enum",nullable = false)
    private Level level;

    @Column(name = "name",nullable = false)
    private String name;

    @ManyToOne
    private User author;

    @Column(name = "video_url")
    private String videoUrl;

    @ManyToMany
    private Set<Categories> categories;

    public Route() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Set<Categories> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categories> categories) {
        this.categories = categories;
    }

    public void addCategories(Set<Categories> categories) {
        this.categories.addAll(categories);
    }
}
