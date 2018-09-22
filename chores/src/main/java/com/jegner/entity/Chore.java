package com.jegner.entity;

import javax.persistence.*;

@Entity
public class Chore {
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column
    private String name;
    @ManyToOne
    private User user;

    public Chore(String name) {
        this.name = name;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chore() {
    }

    public Chore(String name, User user) {
        this.name = name;
        this.user = user;
    }
}
