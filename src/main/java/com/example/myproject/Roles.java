package com.example.myproject;

public enum Roles {
    USER, ADMIN;

    @Override
    public String toString() {
        return "ROLE_" + name();
    }
}
