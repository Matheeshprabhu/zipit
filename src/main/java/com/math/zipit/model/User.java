package com.math.zipit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Entity
public class User {

    @Id
    private Long userId;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Timestamp createdAt;

    @PrePersist
    protected void onCreate() {
        // Set the creation timestamp before persisting the entity
        createdAt = new Timestamp(System.currentTimeMillis());
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
