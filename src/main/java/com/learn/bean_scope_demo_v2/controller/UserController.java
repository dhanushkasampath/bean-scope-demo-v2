package com.learn.bean_scope_demo_v2.controller;

import com.learn.bean_scope_demo_v2.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private User user;

    public UserController(){
        System.out.println("UserController init");
    }

    @PostConstruct
    public void init(){
        System.out.println("UserController hashcode: " + this.hashCode() +
                " | User Object hashcode: " + user.hashCode());
    }

    @GetMapping(path = "/fetchUser1")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("Fetch user api");
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
