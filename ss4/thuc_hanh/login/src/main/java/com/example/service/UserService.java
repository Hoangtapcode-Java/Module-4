package com.example.service;

import com.example.dto.UserDto;
import com.example.model.Login;
import com.example.model.User;
import com.example.repository.IUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public UserDto checkLogin(Login login){
        UserDto userDto = new UserDto();
        User user = iUserRepository.checkLogin(login);
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }
}
