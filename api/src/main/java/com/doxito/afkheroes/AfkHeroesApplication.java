package com.doxito.afkheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AfkHeroesApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(AfkHeroesApplication.class);
        sa.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AfkHeroesApplication.class);
    }
}
