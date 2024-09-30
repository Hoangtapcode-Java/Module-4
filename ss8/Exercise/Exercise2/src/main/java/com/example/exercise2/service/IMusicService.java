package com.example.exercise2.service;

import com.example.exercise2.model.Music;

import java.util.List;

public interface IMusicService {
    void save(Music music);

    List<Music> findAll();

    Music findById(Integer id);
}
