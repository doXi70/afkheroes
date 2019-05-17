package com.doxito.afkheroes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {

    @GetMapping(value = "/api/test")
    public void test() {
        System.out.println("request passed!");
    }

    @PostConstruct
    public void init() {
        System.out.println();
    }
}
