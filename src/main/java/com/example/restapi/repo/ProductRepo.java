package com.example.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
