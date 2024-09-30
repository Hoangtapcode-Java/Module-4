package com.example.exercise2.service;

import com.example.exercise2.model.Music;
import com.example.exercise2.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService{
    @Autowired
    IMusicRepository iMusicRepository;
    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public Music findById(Integer id) {
        return iMusicRepository.findById(id).get();
    }
}
