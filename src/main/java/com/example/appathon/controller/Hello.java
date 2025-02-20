package com.example.appathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RestController
@CrossOrigin
public class Hello {
    @GetMapping("/")
    public String getMethodName() {
        return new String("hellow world");
    }
    
}
