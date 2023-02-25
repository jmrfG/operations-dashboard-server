package com.example.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String paymentType;
    private String description;
    private String referenceDate;
    private String paymentDate;
    private Float totalValue;
    private Float paidValue;
    private Float remainingValue;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getReferenceDate() {
        return referenceDate;
    }
    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Float getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Float totalValue) {
        this.totalValue = totalValue;
    }
    public Float getPaidValue() {
        return paidValue;
    }
    public void setPaidValue(Float paidValue) {
        this.paidValue = paidValue;
    }
    public Float getRemainingValue() {
        return remainingValue;
    }
    public void setRemainingValue(Float remainingValue) {
        this.remainingValue = remainingValue;
    }
    
    
    
    
    
}
