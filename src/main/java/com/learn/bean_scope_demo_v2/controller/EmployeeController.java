package com.learn.bean_scope_demo_v2.controller;

import com.learn.bean_scope_demo_v2.entity.Employee;
import com.learn.bean_scope_demo_v2.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Scope("prototype") // since scope is prototype this will not initialize
public class EmployeeController { // at the application start up

    @Autowired
    private User user;

    @Autowired
    private Employee employee;

    public EmployeeController(){
        System.out.println("EmployeeController init");
    }

    @PostConstruct
    public void init(){
        System.out.println("EmployeeController hashcode: " + this.hashCode() +
            " | User Object hashcode: " + user.hashCode() +
            " | Employee Object hashcode: " + employee.hashCode());
    }

    @GetMapping(path = "/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("Fetch user api");
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
