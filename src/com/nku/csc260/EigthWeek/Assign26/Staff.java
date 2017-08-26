package com.nku.csc260.EigthWeek.Assign26;

/**
 * @author Arseny
 * @since 8/25/2017
 */
public class Staff extends Employee {

    Staff(String office, double salary, String hired, String name, String address, String phone, String email) {
        super(office, salary, hired, name, address, phone, email);
    }

    public String toString() {
        return super.getName() + " is Staff";
    }
}
