package com.example.restcrud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Restcrud2Application {

	public static void main(String[] args) {
		SpringApplication.run(Restcrud2Application.class, args);
	}
	@Bean
    public RestTemplate getRestTemplate() {
    	return new RestTemplate();
    }
}
