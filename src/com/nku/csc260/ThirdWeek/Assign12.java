package com.nku.csc260.ThirdWeek;

import java.util.Scanner;

/**
 * 12th assignment of the 3rd week, of the CSC 260 Course at NKU. Goal: create an app that computes amount of money in
 * the bank, by prompting user for deposit, interest and maturity.
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign12 {
    public static void main (String[] args) {
        final String TABLE_FORMAT = "%-10s %-10s \n";

        Scanner input = new Scanner(System.in);
        double depositAmount;
        double percentageYield;
        double value;
        int maturityPeriod;



        System.out.print("Enter the initial deposit amount: ");
        depositAmount = input.nextDouble();
        value = depositAmount;

        System.out.print("Enter annual percentage yield: ");
        percentageYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        maturityPeriod = input.nextInt();

        System.out.printf(TABLE_FORMAT, "Month", "CD Value");
        for (int i = 1; i <= maturityPeriod; i++) {
            value += value * percentageYield / 1200;

            System.out.printf(TABLE_FORMAT, i, (double)Math.round(value * 100) / 100);
        }
    }

}
