package com.Spring.Fundamentals.pathfinder.repository;

import com.Spring.Fundamentals.pathfinder.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<Messages,Long> {
}
