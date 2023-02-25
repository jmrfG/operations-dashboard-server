package com.example.restapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.Operation;
import com.example.restapi.service.OperationsService;

@RestController
@RequestMapping("/api/operations")
public class OperationController {

  @Autowired
  private OperationsService productService;

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/get_All")
  public ResponseEntity<List<Operation>> getAllTopics() {
    List<Operation> topics = productService.getAllOperations();
    return ResponseEntity.ok(topics);
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/{id}")
  public Operation getOperationById(@PathVariable("id") Integer id) {
    return productService.getOperationById(id);
  }

  
  @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping("/add_product")
  public Operation addOperation(@RequestBody Operation Operation) {
    return productService.addOperation(Operation);
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @DeleteMapping("/delete/{id}")
  public void deleteOperation(@PathVariable("id") Integer id) {
    productService.deleteOperation(id);
  }

}
