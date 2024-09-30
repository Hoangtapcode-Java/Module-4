package com.example.service;

import com.example.model.Music;
import com.example.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService implements IMusicService{
    @Autowired
    IMusicRepository iMusicRepository;
    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void create(Music music) {
        iMusicRepository.create(music);
    }

    @Override
    public void delete(Integer id) {
        iMusicRepository.delete(id);
    }

    @Override
    public Music findById(Integer id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void edit(Music music) {
        iMusicRepository.edit(music);
    }

}
