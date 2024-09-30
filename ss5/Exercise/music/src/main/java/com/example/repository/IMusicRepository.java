package com.example.repository;

import com.example.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void create(Music music);

    void delete(Integer id);

    Music findById(Integer id);

    void edit(Music music);
}
