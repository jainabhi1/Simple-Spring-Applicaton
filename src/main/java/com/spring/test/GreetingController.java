package com.spring.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

    Greeting greeting;

    GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @RequestMapping("/greet")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greeting.greete(name);
    }
}
