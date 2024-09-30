package com.example.repository;

import com.example.model.Login;
import com.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository implements IUserRepository{
    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("hoang","hoang123","Hoang","hoang123@gmail.com",18));
        userList.add(new User("chien","chien456","Chien","hoangchien@gmail.com",25));
        userList.add(new User("linh","linh789","Linh","hoailinh@gmail.com",31));
    }
    @Override
    public User checkLogin(Login login) {
        for(User user:userList){
            if((user.getAccount().equals(login.getAccount()))
            && (user.getPassword().equals(login.getPassword()))){
                return user;
            }
        }
        return null;
    }
}
