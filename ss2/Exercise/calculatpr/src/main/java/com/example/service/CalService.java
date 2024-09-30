package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalService implements ICalService{
    @Override
    public float getAddition(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float getSubtraction(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public float getMultiplication(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float getDivision(float num1, float num2) {
        return num1 / num2;
    }
}
