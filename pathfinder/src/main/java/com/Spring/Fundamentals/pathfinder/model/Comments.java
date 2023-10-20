package com.Spring.Fundamentals.pathfinder.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "comments")
public class Comments extends BaseEntity {

    @Column(name = "approved")
    private boolean approved;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "text_content",columnDefinition = "TEXT",nullable = false)
    private String textContent;

    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

    public Comments() {
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
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
