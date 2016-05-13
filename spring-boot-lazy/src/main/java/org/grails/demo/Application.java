package org.grails.demo;

import org.grails.demo.config.LazyBeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({LazyBeanConfig.class})
@ComponentScan({"org.grails.demo.controllers", "org.grails.demo.services"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}