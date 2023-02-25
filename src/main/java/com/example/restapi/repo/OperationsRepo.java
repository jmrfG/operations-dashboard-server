package com.example.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.model.Operation;

@Repository
public interface OperationsRepo extends JpaRepository<Operation, Integer> {
    
}
