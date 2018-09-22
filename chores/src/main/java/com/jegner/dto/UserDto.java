package com.jegner.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    Integer id;
    String name;
    List<ChoreDto> choreDtos = new ArrayList<>();

    public UserDto(Integer id, String name, List<ChoreDto> choreDtos) {
        this.id = id;
        this.name = name;
        this.choreDtos = choreDtos;
    }

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChoreDto> getChoreDtos() {
        return choreDtos;
    }

    public void setChoreDtos(List<ChoreDto> choreDtos) {
        this.choreDtos = choreDtos;
    }
}
