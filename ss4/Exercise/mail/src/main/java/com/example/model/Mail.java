package com.example.model;

public class Mail {
    private String language;
    private Integer pageSize;
    private String spams;
    private String signature;

    public Mail() {
    }

    public Mail(String languages, Integer pageSize, String spams, String signature) {
        this.language = languages;
        this.pageSize = pageSize;
        this.spams = spams;
        this.signature = signature;
    }

    public String getEngLish() {
        return language;
    }

    public void setEngLish(String languages) {
        this.language = languages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpams() {
        return spams;
    }

    public void setSpams(String spams) {
        this.spams = spams;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
