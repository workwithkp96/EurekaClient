package com.karan.paul.eureka.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    @LoadBalanced  // Enables Ribbon load balancing for RestTemplate
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
