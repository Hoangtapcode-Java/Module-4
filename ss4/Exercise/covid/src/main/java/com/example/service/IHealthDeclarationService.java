package com.example.service;

import com.example.model.HealthDeclaration;

import java.util.List;

public interface IHealthDeclarationService {
    void save(HealthDeclaration healthDeclaration);

    List<HealthDeclaration> find();
}
