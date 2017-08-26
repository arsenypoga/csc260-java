package com.nku.csc260.EigthWeek.Assign26;

public class Person {
    private String _name;
    private String _address;
    private String _phone;
    private String _email;


    public Person(String name, String address, String phone, String email){
        this._name = name;
        this._address = address;
        this._phone = phone;
        this._email = email;
    }

    public String toString(){
        return this._name + " is Person";
    }

    public String getName(){
        return this._name;
    }

}