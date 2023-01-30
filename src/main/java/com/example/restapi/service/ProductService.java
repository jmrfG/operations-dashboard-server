package com.example.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.model.Product;
import com.example.restapi.repo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product addProduct(Product Product) {
        return productRepo.save(Product);
    }

    public void deleteProduct(Integer id) {
        productRepo.deleteById(id);
    }

}
