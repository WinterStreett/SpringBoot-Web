package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    User queryById(Integer uid);
    List<User> query();
    void create(User user);
    void update(User user);
    void delete(Integer uid);
}
