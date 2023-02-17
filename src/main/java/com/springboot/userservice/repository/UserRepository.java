package com.springboot.userservice.repository;

import com.springboot.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User,Long> {
}
