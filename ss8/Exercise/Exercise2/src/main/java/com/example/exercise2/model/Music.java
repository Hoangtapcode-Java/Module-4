package com.example.exercise2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Tên bài hát không được để trống")
    @Size(max = 800,message = "Tên bài hát quá dài")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$",message = "Tên bài hát không đúng định dạng")
    private String nameSong;

    @NotEmpty(message = "Không được để trống")
    @Size(max = 300, message = "Tên nghệ sĩ quá dài")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$",message = "Tên ca sĩ không đúng định dạng")
    private String nameSinger;

    @NotEmpty(message = "không được để trống")
    @Size(max = 1000, message = "Tên thể loại quá dài")
    @Pattern(regexp = "^[a-zA-Z0-9,]*$")
    private String category;

    public Music() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
