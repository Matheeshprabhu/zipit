package com.math.zipit.model;

import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class Product {

    @Id
    private Long productId;
    private String productName;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private Timestamp createdAt;

    @PrePersist
    protected void onCreate() {
        // Set the creation timestamp before persisting the entity
        createdAt = new Timestamp(System.currentTimeMillis());
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
