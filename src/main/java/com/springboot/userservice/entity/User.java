package com.springboot.userservice.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long userId;
    private String fName;
    private String lName;
    private String email;
    private String departmentId;
}
