package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeSong;
    private String nameSong;
    private String singer;
    private String category;

    public Music() {
    }

    public Music(Integer codeSong, String nameSong, String singer, String category) {
        this.codeSong = codeSong;
        this.nameSong = nameSong;
        this.singer = singer;
        this.category = category;
    }

    public Integer getCodeSong() {
        return codeSong;
    }

    public void setCodeSong(Integer codeSong) {
        this.codeSong = codeSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
