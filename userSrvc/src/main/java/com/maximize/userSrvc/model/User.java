package com.maximize.userSrvc.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;

    public User withId(Long id) {
        this.id = id;
        return this;
    }

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
