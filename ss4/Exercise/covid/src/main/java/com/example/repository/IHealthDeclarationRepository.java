package com.example.repository;

import com.example.model.HealthDeclaration;

import java.util.List;

public interface IHealthDeclarationRepository {
    void save(HealthDeclaration healthDeclaration);

    List<HealthDeclaration> find();
}
