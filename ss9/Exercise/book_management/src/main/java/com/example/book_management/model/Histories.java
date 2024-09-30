package com.example.book_management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Histories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistory;

    private String name;

    private String time;


    public Histories(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public Histories() {
    }

    public Integer getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(Integer idHistory) {
        this.idHistory = idHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
