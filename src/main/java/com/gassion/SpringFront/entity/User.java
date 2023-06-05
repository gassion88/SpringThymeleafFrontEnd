package com.gassion.SpringFront.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;

    private String name;

    private String surname;

    private int age;

    private String number;

    private String email;

    private List<String> lang;

    public User() {
    }

    public User(int id, String name, String surname, int age, String number, String email, List<String> lang) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
        this.email = email;
        this.lang = lang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getLang() {
        return lang;
    }

    public void setLang(List<String> lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", lang=" + lang +
                '}';
    }
}
