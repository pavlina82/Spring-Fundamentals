package com.Spring.Fundamentals.pathfinder.model;

import com.Spring.Fundamentals.pathfinder.model.Enums.CategoryName;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories extends BaseEntity{


    @Enumerated(EnumType.STRING)
    @Column(name = "name",nullable = false)
    private CategoryName name;

    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

    public Categories() {
    }

    public CategoryName getName() {
        return name;
    }

    public void setName(CategoryName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
