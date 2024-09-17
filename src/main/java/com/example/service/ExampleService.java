package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class ExampleService {
    
    @Value("${test.value}")
    private String value1;
    
    public String getValue1(){

        return value1;
    }
}
