package com.example.consuming.rest.repository;

import com.example.consuming.rest.models.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {
}
