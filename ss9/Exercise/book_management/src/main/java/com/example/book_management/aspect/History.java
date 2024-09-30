package com.example.book_management.aspect;

import com.example.book_management.model.Histories;
import com.example.book_management.service.IHistoriesService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Aspect
@Component
public class History {
    @Autowired
    IHistoriesService iHistoriesService;

    @After("execution(* com.example.book_management.controller.BookController.*(..))")
    public void logAfterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String time = LocalDateTime.now().toString();
        Histories history = new Histories(name,time);
        iHistoriesService.save(history);
        System.out.println(name);
    }
}
