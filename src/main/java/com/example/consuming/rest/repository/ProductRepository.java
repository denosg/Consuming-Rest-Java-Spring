package com.example.consuming.rest.repository;

import com.example.consuming.rest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
