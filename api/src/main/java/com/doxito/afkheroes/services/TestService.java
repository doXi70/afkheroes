package com.doxito.afkheroes.services;

import com.doxito.afkheroes.models.entities.TestEntity;

public interface TestService {

    TestEntity findById(Long id);

    void save(TestEntity entity);

}
