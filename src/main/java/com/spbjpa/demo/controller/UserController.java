package com.spbjpa.demo.controller;

import com.spbjpa.demo.dao.UserRepository;
import com.spbjpa.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class UserController {
//test
    @Resource
    private UserRepository userRepository;

    @RequestMapping("/id")
    public String getUsers(String id){
        System.out.println("id is:"+id);
        return userRepository.getAll(id);

    }

    @RequestMapping("/id1")
    public String addUser1(String id) {
        System.out.println("id is:"+id);
        return userRepository.getAll1(id);
    }
}
