package com.example.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Table(name = "\"user\"")
@Entity
public class User {
    private String email;
    private String password;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public User(String email, String password, Long id) {
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
