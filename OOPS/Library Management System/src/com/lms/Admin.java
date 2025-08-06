package com.lms;

public class Admin extends User{

    public Admin(String name,int id)
    {
        super(name,id);
    }

    @Override
    public void displayUserDetails()
    {
        System.out.println("Admin: "+this.name+ ", Id "+this.id);
    }
}
