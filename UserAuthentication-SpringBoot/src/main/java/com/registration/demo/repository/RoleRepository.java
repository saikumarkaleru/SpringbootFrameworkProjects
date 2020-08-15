package com.registration.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}