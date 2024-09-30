package com.example.repository;

import com.example.model.HealthDeclaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class HealthDeclarationRepository implements IHealthDeclarationRepository{

    private List<HealthDeclaration> healthDeclarationList = new ArrayList<>();
    @Override
    public void save(HealthDeclaration healthDeclaration) {
        healthDeclarationList.add(healthDeclaration);
    }

    @Override
    public List<HealthDeclaration> find() {
        return healthDeclarationList;
    }
}
