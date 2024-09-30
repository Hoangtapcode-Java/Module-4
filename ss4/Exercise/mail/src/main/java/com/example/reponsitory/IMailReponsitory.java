package com.example.reponsitory;

import com.example.model.Mail;

import java.util.List;

public interface IMailReponsitory {
    List<Mail> findAll();

    void update(Mail mail);
}
