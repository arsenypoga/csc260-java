package com.nku.csc260.EigthWeek.Assign26;

/**
 * @author Arseny
 * @since 8/25/2017
 */
public class Employee extends Person {
    String _office;
    double _salary;
    String _hired;

    Employee (String office, double salary,String hired,String name,String address,String phone,String email) {
        super(name, address, phone, email);
        this._office = office;
        this._salary = salary;
        this._hired = hired;
    }

    public String toString() {
        return getName() + " is an Employee, ";
    }

}
