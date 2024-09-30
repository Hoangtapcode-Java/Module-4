package com.example.service;

import com.example.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void create(Music music);

    void delete(Integer id);

    Music findById(Integer id);

    void edit(Music music);
}
