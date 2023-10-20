package com.Spring.Fundamentals.pathfinder.model;


import com.Spring.Fundamentals.pathfinder.model.Enums.UserRoles;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity{

    @Column(name = "names")
    private UserRoles name;

    public Role() {
    }

    public UserRoles getName() {
        return name;
    }

    public void setName(UserRoles name) {
        this.name = name;
    }
}
