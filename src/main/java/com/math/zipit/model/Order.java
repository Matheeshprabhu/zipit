package com.math.zipit.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long userId;
    private Timestamp orderDate;
    private String status;

//    @PrePersist
//    protected void onCreate() {
//        // Set the creation timestamp before persisting the entity
//        orderDate = new Timestamp(System.currentTimeMillis());
//    }

    public void setOrder_id(Long orderId) {
        this.orderId = orderId;
    }

    public void setUser_id(Long userId) {
        this.userId = userId;
    }

    public void setOrder_date(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
