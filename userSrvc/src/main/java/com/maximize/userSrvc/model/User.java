package com.maximize.userSrvc.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity

@Table(name = "system_users")
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
