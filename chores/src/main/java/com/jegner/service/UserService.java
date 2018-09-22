package com.jegner.service;

import java.util.List;

import com.jegner.dto.UserDto;

public interface UserService {
    UserDto getUserById(Integer userId);

    void saveUser(UserDto userDto);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);
}
