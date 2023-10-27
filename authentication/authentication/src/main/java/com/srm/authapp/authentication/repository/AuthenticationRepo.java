package com.srm.authapp.authentication.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
public interface AuthenticationRepo{
    User findById(Long userId);
    User findByUsername(String username);
    void save(User user);
    void update(User user);
    void delete(Long userId);
    List<User> findAll();
}






