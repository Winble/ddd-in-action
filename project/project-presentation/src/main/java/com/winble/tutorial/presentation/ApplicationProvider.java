package com.winble.tutorial.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Create on 2020/7/12
 *
 * @author bowenzhang
 */
@SpringBootApplication
//@ImportResource("/dubbo-provider.xml")
public class ApplicationProvider {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationProvider.class, args);
    }
}
