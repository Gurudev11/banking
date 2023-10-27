package com.srm.authapp.authentication.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;


public interface AuthenticationDao {
	 
    User getUserById(Long userId);
    User getUserByUsername(String username);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long userId);
    List<User> getAllUsers();
}
