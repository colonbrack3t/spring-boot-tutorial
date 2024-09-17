package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ExampleService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping
@Component
@RequiredArgsConstructor
public class AppController {
    
    private final ExampleService exampleService;
    @GetMapping("/")
    public String getRoot(@RequestParam(value="send",required=false) String param) {
        return "Hello World! You sent me " + param;
    }

    @GetMapping("/value1")
    public String getMethodName() {
        return exampleService.getValue1();
    }
    
}
