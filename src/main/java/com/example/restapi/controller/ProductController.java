package com.example.restapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.Product;
import com.example.restapi.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
      }
    

      @GetMapping("/get_All")
      public ResponseEntity<List<Product>> getAllTopics() {
        List<Product> topics = productService.getAllProducts();
        return ResponseEntity.ok(topics);
      }
}
