package com.Spring.Fundamentals.pathfinder.repository;

import com.Spring.Fundamentals.pathfinder.model.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PicturesRepository extends JpaRepository<Pictures,Long> {
}
