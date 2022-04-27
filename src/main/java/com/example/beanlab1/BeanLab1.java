package com.example.beanlab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class BeanLab1 {

    public static void main(String[] args) {
        SpringApplication.run(BeanLab1.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {             //lambda ->
            System.out.println("Inspecting the beans provided by spring boot");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames
            ) {
                System.out.println(beanName);

            }
        };
    }
}