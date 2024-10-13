package com.karan.paul.eureka.client.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eurekaclient")
@RequiredArgsConstructor
public class EurekaClientController {

    private final RestTemplate restTemplate;

    @GetMapping("/fetch-users")
    public String fetchUsers() {
        //Here, http://USER-SERVICE is the name of the service registered in Eureka.
        //Spring Cloud will automatically resolve the service name to its instances and balance the load through Rest Template.
        return restTemplate.getForObject("http://EUREKA CLIENT2/data", String.class);
    }
}
