package com.user.entity;

import java.util.*;

public class User {

    private Long userId;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public Long getUserId() {
        return userId;
    }

    public User setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public User setContacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    public User() {

}


}
