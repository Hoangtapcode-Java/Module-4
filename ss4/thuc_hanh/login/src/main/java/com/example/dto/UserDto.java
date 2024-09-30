package com.example.dto;

public class UserDto {
    private String account;
    private String name;
    private String email;
    private Integer age;

    public UserDto() {
    }

    public UserDto(String account, String name, String email, Integer age) {
        this.account = account;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
