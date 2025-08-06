package com.lms;

public class User{
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayUserDetails()
    {
        System.out.println("User "+ name + ", Id "+id);
    }
}
