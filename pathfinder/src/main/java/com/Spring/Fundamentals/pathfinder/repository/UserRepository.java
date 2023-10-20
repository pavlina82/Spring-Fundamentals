package com.Spring.Fundamentals.pathfinder.repository;

import com.Spring.Fundamentals.pathfinder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
