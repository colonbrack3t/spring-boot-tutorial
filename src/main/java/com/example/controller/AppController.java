package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
@Component
public class AppController {
    
    @GetMapping("/")
    public String getRoot(@RequestParam("send") String param) {
        return "Hello World! You sent me " + param;
    }
}
