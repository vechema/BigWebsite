package com.jegner.dto;

public class ChoreDto {
    Integer id;
    String name;

    public ChoreDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ChoreDto() {
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
}
