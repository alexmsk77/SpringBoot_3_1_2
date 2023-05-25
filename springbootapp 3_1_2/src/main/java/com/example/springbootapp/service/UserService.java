package com.example.springbootapp.service;

import com.example.springbootapp.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    Object readById(int id);
}
