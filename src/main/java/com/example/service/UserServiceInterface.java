package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    void addUser(User user);
    User findByEmail(String email);
    void deleteById(Long id);
}
