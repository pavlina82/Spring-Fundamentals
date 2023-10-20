package com.Spring.Fundamentals.pathfinder.repository;

import com.Spring.Fundamentals.pathfinder.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentsRepository extends JpaRepository<Comments,Long> {
}
