package com.Spring.Fundamentals.pathfinder.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pictures")
public class Pictures extends BaseEntity{

    @Column(name = "title")
    private String title;

    @Column(name = "url",columnDefinition = "TEXT")
    private String url;

    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

    public Pictures() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
