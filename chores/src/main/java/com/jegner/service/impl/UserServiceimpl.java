package com.jegner.service.impl;

import com.jegner.converter.UserConverter;
import com.jegner.dto.UserDto;
import com.jegner.entity.User;
import com.jegner.repository.UserRepository;
import com.jegner.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserById(Integer userId) {
        return userRepository.getOne(userId);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.delete(userId);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
