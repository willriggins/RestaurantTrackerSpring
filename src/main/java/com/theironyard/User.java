package com.theironyard;

import javax.persistence.*;

/**
 * Created by will on 6/21/16.
 */
@Entity //this annotation is necessary to store this in the db
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
