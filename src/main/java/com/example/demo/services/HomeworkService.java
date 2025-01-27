package com.example.demo.services;

import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

@Service
public class HomeworkService {

    public String pokemonAbilities(String param){
        // return "Pokemon Abilities " + param;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + param,String.class);

        return result;
    }

	// public MyService(RestClient.Builder restClientBuilder) {
	// 	this.restClient = restClientBuilder.baseUrl("https://example.org").build();
	// }

	// public Details someRestCall(String name) {
	// 	return this.restClient.get().uri("/{name}/details", name).retrieve().body(Details.class);
	// }
}
