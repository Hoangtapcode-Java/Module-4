package com.example.exercise1.repository;

import com.example.exercise1.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser,Integer> {
    AppUser findByUserName(String userName);
}
