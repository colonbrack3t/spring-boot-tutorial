package com.example.demo.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

// only instantiate once and used in multiple different places as its a service. 
@Service
public class MyService {

    private final HomeworkService homeworkService;

    public String myFunction(){
        return "<h1>Hello World</h1>";
    }
    public String homework(String pokemonName){
        // Call another service (make a new service)
        // call a function from the other service.

        /*
        1. create a service
        2. write a function that takes a pokemon name and returns a pokemon name back
        3. dependancy inject that service into this one
        4. make a new get endpoint from the controller to call this function (name a param name)
        5. run e2e
        6. Make the function in step 2 call the pokemon api
        7. Error handling and styling, etc in this function
        */ 

        // filters and exception handler advice

        // throw new Exception();
        return "<h1>Hello</h1>" + homeworkService.pokemonAbilities(pokemonName);
    }
}
