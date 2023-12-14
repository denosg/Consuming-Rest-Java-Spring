package com.example.consuming.rest.models;

import jakarta.persistence.Entity;

@Entity
public class UserType {
    private String userType;

    // Constructor
    public UserType(String userType) {
        this.userType = userType;
    }

    // Getter
    public String getUserType() {
        return userType;
    }

    // Setter (if needed)
    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "userType='" + userType + '\'' +
                '}';
    }
}

