package com.learn.bean_scope_demo_v2.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

    @Autowired
    private User user;

    public Employee() {
        System.out.println("Employee Object Initialized!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Employee Object hashcode: " + this.hashCode() +
                " | User Object hashcode: " + user.hashCode());
    }
}
