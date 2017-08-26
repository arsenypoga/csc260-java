package com.nku.csc260.EigthWeek.Assign28;

/**
 * @author Arseny
 * @since 8/25/2017
 */
public class Employee {
    private String _name;
    private double _salary;

    Employee(String name, double salary) {
        this._name = name;
        this._salary = salary;
    }

    public String getName() {
        return this._name;
    }

    public double computePay () {
        double twoWeekPayment = this._salary * (1/26.0);

        return  twoWeekPayment - (0.3 * (twoWeekPayment));
    }


}
