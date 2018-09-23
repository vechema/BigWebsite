package com.jegner.service;

import java.util.List;

import com.jegner.entity.User;

public interface UserService {
    User getUserById(Integer userId);

    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUser(Integer userId);

    void updateUser(User user);
}
