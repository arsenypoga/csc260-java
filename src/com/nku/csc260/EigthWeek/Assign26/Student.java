package com.nku.csc260.EigthWeek.Assign26;


public class Student extends Person{
    private final String _STATUS;

    public Student (String status, String name, String address, String phone, String email){
        super(name, address, phone, email);
        this._STATUS = status;

    }

    public String toString(){
        return super.getName() + " is Student";
    }

}