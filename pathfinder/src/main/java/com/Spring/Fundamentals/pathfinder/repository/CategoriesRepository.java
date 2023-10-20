package com.Spring.Fundamentals.pathfinder.repository;

import com.Spring.Fundamentals.pathfinder.model.Categories;
import com.Spring.Fundamentals.pathfinder.model.Enums.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Long> {


    Set<Categories> findByNameIn(Set<CategoryName> categories);
}
