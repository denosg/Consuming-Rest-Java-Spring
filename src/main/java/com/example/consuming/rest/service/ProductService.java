package com.example.consuming.rest.service;

import com.example.consuming.rest.models.APIResponse;
import com.example.consuming.rest.models.Product;
import com.example.consuming.rest.repository.CategoryRepository;
import com.example.consuming.rest.repository.ProductRepository;
import com.example.consuming.rest.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    public void fetchDataAndSave() {
        String apiUrl = "https://automationexercise.com/api/productsList";

        RestTemplate restTemplate = new RestTemplate();
        APIResponse response = restTemplate.getForObject(apiUrl, APIResponse.class);

        if (response != null && response.getResponseCode() == 200) {
            for (Product product : response.getProducts()) {
                productRepository.save(product);
            }
        } else {
            System.err.println("Failed to fetch data from the API.");
        }
    }
}
