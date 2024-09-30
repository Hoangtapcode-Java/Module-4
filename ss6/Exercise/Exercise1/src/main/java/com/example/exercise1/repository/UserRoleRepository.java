package com.example.exercise1.repository;


import com.example.exercise1.model.AppUser;
import com.example.exercise1.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
    List<UserRole> findByAppUser(AppUser appUser);
}
