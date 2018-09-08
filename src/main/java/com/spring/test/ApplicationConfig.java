package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ApplicationConfig {

    @Bean Greeting greeting() {
        return new Greeting();
    }

    @Bean GreetingController greetingController() {
        return new GreetingController(greeting());
    }
}
