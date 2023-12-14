package com.example.consuming.rest.models;

import java.util.List;

public class APIResponse {
    private int responseCode;
    private List<Product> products;

    public APIResponse(int responseCode, List<Product> products) {
        this.responseCode = responseCode;
        this.products = products;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // getters and setters
}
