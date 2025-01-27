package com.example.demo.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.MyService;

import lombok.RequiredArgsConstructor;

// decorators
@RestController
@Component
@RequiredArgsConstructor
// basically like the route folder/file in react/angular
// if this then that, just reroute
public class Controller {

    // controllerService is going to be of type MyService
    // final is basically a const
    private final MyService controllerService;

    // // constructor --  not not needed due to RequiredArgsConstructor, will be done as there is the 'private final' line above
    // public Controller(MyService service){
    //     this.controllerService = service;
    // }

    @GetMapping("/")
    public String helloWorldGet(@RequestParam(value = "blah", required = false) String param){
        // return "Hello world " + param;
        return controllerService.myFunction();
    }

    @GetMapping("/pokemon")
    public String pokemonGet(@RequestParam(value = "pokemon", required = true) String pokemon){
        // return "Hello world " + param;
        return controllerService.homework(pokemon);
    }
}
