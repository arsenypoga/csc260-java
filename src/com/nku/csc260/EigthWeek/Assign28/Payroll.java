package com.nku.csc260.EigthWeek.Assign28;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Arseny
 * @since 8/25/2017
 */
public class Payroll {
    static Scanner input = new Scanner(System.in);
    static final String FORMAT_PATTERN = "%-4s %-4s \n";
    static DecimalFormat twoDecimalPlaces = new DecimalFormat("###.##");

    public static void main (String[] args) {


        System.out.print("Enter number of employees: ");
        showEmployeePay(input.nextInt());

    }

    public static void showEmployeePay (int number) {
        String employeeName;
        double employeeSalary;


        Employee[] employeeArr = new Employee[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter name: ");
            employeeName = input.next();
            System.out.print("Enter salary: ");
            employeeSalary = input.nextDouble();

            employeeArr[i] = new Employee(employeeName, employeeSalary);
        }

        System.out.printf(FORMAT_PATTERN, "Employee", "Pay");

        for (Employee employee : employeeArr) {
            System.out.printf(FORMAT_PATTERN, employee.getName(), "$" + twoDecimalPlaces.format(employee.computePay()));
        }

    }

}

