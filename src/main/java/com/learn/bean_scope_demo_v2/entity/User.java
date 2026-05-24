package com.learn.bean_scope_demo_v2.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component // Singleton bean
public class User {
    public User() {
        System.out.println("User Object Initialized!");
    }

    @PostConstruct
    public void init(){
        System.out.println("User object hashcode: " + this.hashCode());
    }
}
