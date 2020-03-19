package com.winble.tutorial.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author bowenzhang
 */
@SpringBootApplication
public class ServiceInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootServletInitializer.class);
    }

//    public static void main(String[] args) {
//        SpringApplication.run()
//    }
}
