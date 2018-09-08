package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String Args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Greeting newGreeting = context.getBean(Greeting.class);
        newGreeting.greete(" Abhishek");
    }
}
