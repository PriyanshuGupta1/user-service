package com.springboot.userservice.service;

import com.springboot.userservice.VO.Department;
import com.springboot.userservice.VO.ResponseTemplateVO;
import com.springboot.userservice.entity.Users;
import com.springboot.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;
    public Users saveUser(Users user) {
        log.info("inside saveUser in UserService ");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("inside getUserWithDepartment  in UserService ");
        ResponseTemplateVO vo=new ResponseTemplateVO();
        Users user=userRepository.findByUserId(userId);
        Department department=restTemplate.getForObject("http://localhost:8081/departments/"+user.getDepartmentId()
                ,Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
