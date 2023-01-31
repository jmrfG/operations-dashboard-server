package com.example.restapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.Product;
import com.example.restapi.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/get_All")
  public ResponseEntity<List<Product>> getAllTopics() {
    List<Product> topics = productService.getAllProducts();
    return ResponseEntity.ok(topics);
  }

  public Product getProductById(Integer id) {
    return productService.getProductById(id);
  }

  @PostMapping("/add_product")
  public Product addProduct(@RequestBody Product Product) {
    return productService.addProduct(Product);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteProduct(@PathVariable("id") Integer id) {
    productService.deleteProduct(id);
  }

}
