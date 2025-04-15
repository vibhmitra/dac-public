package com.vibhmitra.simpleWebApp.service;

import com.vibhmitra.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // Dummy Data
    List<Product> products = Arrays.asList(
            new Product(101, "Iron", 400),
            new Product(102, "Speaker", 300),
            new Product(103, "TV", 500)
    );

    // service to get All product details
    public List<Product> getProducts() {
        return products;
    }
}
