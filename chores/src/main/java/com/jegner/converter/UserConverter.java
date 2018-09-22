package com.jegner.converter;

import java.util.stream.Collectors;

import com.jegner.dto.UserDto;
import com.jegner.entity.User;

public class UserConverter {
    public static User dtoToEntity(UserDto userDto) {
        User user = new User(userDto.getName(), null);
        user.setId(userDto.getId());
        user.setChores(userDto.getChoreDtos().stream().map(ChoreConverter::dtoToEntity).collect(Collectors.toList()));
        return user;
    }

    public static UserDto entityToDto(User user) {
        UserDto userDto = new UserDto(user.getId(), user.getName(), null);
        userDto.setChoreDtos(user.getChores().stream().map(ChoreConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }
}
