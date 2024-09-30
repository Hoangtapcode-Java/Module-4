package com.example.service;

import com.example.dto.UserDto;
import com.example.model.Login;


public interface IUserService {
    public UserDto checkLogin(Login login);
}
