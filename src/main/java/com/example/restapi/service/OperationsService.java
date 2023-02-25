package com.example.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.model.Operation;
import com.example.restapi.repo.OperationsRepo;

@Service
public class OperationsService {
    
    @Autowired
    private OperationsRepo operationsRepo;

    
    public List<Operation> getAllOperations() {
        return operationsRepo.findAll();
    }

    public Operation getOperationById(Integer id) {
        return operationsRepo.findById(id).orElse(null);
    }

    public Operation addOperation(Operation Operation) {
        return operationsRepo.save(Operation);
    }

    public void deleteOperation(Integer id) {
        operationsRepo.deleteById(id);
    }

}
