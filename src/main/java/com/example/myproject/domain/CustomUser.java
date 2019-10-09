package com.example.myproject.domain;

import com.example.myproject.Roles;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "users")
@Data
public class CustomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String login;
    private String password;
    @Email
    private String email;
    @Enumerated
    private Roles role;

    public CustomUser(String password, @Email String email) {
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
