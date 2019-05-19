package com.doxito.afkheroes.controllers;

import com.doxito.afkheroes.models.entities.TestEntity;
import com.doxito.afkheroes.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(value = "/api/test")
    public ResponseEntity<TestEntity> test() {
        System.out.println("Request Received!");

        TestEntity found = testService.findById(1L);
        System.out.println("Found test entity -> " + found);

        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @PostConstruct
    public void insertTestEntity() {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("Test Name");

        System.out.println("Inserting test entity: " + testEntity);
        this.testService.save(testEntity);
    }

}
