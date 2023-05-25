package com.example.springbootapp.dao;

import com.example.springbootapp.model.User;


import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    User readById(int id);
}
