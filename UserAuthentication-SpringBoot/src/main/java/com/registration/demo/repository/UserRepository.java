package com.registration.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}