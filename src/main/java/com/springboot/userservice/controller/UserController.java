package com.springboot.userservice.controller;

import com.springboot.userservice.VO.ResponseTemplateVO;
import com.springboot.userservice.entity.Users;
import com.springboot.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users user){
        log.info("inside saveUser in UserController");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("inside getUserWithDepartment in UserController");
        return userService.getUserWithDepartment(userId);
    }
}
