package com.example.service;

import com.example.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> findAll();

    void update(Mail mail);
}
