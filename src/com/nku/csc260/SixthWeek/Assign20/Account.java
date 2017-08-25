package com.nku.csc260.SixthWeek.Assign20;

import java.util.Date;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Account {

    private int _id = 0;
    private double _balance = 0;
    private double _annualInterestRate = 0;
    private Date _dateCreated = new Date();

    Account () {

    }

    Account(int id, double balance) {
        this._id = id;
        this._balance = balance;
    }


    public double getMonthlyInterest() {
        return this._balance * ((this._annualInterestRate / 100) / 12);
    }

    public void withdraw(double amount) {
        this._balance -= amount;
    }

    public void deposit(double amount) {
        this._balance += amount;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public double get_balance() {
        return _balance;
    }

    public void set_balance(double _balance) {
        this._balance = _balance;
    }

    public double get_annualInterestRate() {
        return _annualInterestRate % 100;
    }

    public void set_annualInterestRate(double _annualInterestRate) {
        this._annualInterestRate = _annualInterestRate * 100;
    }

    public Date getDate() {
        return _dateCreated;
    }
}
