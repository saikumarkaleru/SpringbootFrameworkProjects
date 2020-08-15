package com.registration.demo.service;

import com.registration.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}