package com.example.service;

import com.example.model.Mail;
import com.example.reponsitory.IMailReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService implements IMailService{
    @Autowired
    IMailReponsitory iMailReponsitory;
    @Override
    public List<Mail> findAll() {
        return iMailReponsitory.findAll();
    }

    @Override
    public void update(Mail mail) {
        iMailReponsitory.update(mail);
    }
}
