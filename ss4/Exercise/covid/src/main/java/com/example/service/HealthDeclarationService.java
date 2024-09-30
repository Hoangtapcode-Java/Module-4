package com.example.service;

import com.example.model.HealthDeclaration;
import com.example.repository.IHealthDeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthDeclarationService implements IHealthDeclarationService{
    @Autowired
    IHealthDeclarationRepository iHealthDeclarationRepository;
    @Override
    public void save(HealthDeclaration healthDeclaration) {
        iHealthDeclarationRepository.save(healthDeclaration);
    }

    @Override
    public List<HealthDeclaration> find() {
        return iHealthDeclarationRepository.find();
    }
}
