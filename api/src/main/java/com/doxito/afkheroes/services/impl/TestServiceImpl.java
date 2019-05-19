package com.doxito.afkheroes.services.impl;

import com.doxito.afkheroes.models.entities.TestEntity;
import com.doxito.afkheroes.repositories.TestRepository;
import com.doxito.afkheroes.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository repository;

    @Autowired
    public TestServiceImpl(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public TestEntity findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No such entity with id: " + id));
    }

    @Override
    public void save(TestEntity entity) {
        this.repository.save(entity);
    }
}
