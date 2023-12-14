package com.example.consuming.rest.models;

import jakarta.persistence.Entity;

@Entity
public class Category {
    private UserType userType;
    private String category;

    // Constructor
    public Category(UserType userType, String category) {
        this.userType = userType;
        this.category = category;
    }

    // Getters
    public UserType getUserType() {
        return userType;
    }

    public String getCategory() {
        return category;
    }

    // Setters (if needed)
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "userType=" + userType +
                ", category='" + category + '\'' +
                '}';
    }
}

