package com.springboot.userservice.VO;

//package com.springboot.departmentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long departmentId;
    private String departmentName;
    private String departmentAddr;
    private String departmentCode;
}
