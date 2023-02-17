package com.springboot.userservice.repository;

import com.springboot.userservice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <Users,Long> {
    Users findByUserId(Long userId);
}
