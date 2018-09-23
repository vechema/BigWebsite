package com.jegner.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.jegner.converter.UserConverter;
import com.jegner.dto.UserDto;
import com.jegner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("{userId}")
    public UserDto getUserById(@PathVariable Integer userId) {
        return UserConverter.entityToDto(userService.getUserById(userId));
    }

    @RequestMapping()
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(UserConverter.dtoToEntity(userDto));
    }

    @RequestMapping(value="{userId}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserDto userDto) {
        userService.updateUser(UserConverter.dtoToEntity(userDto));
    }
}
