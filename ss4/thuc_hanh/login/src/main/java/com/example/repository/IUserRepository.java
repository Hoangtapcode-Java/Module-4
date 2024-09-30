package com.example.repository;

import com.example.model.Login;
import com.example.model.User;



public interface IUserRepository {
    public User checkLogin(Login login);
}
