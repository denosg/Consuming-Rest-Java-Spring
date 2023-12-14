package com.example.consuming.rest.repository;


import com.example.consuming.rest.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
