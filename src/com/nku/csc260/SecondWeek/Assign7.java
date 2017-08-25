package com.nku.csc260.SecondWeek;

import java.util.Scanner;

/**
 * 7th assignment of the 2nd week, of the CSC 260 Course at BKU. Goal: Create an app that asks for exchange rate
 * between dollars to RMB, then prompts user about the action he wants to perform - convert RMB to dollars, or vice versa
 * Then it prints the conversion.
 *
 * Page 116 #3.31.
 *
 * @author Arseny
 * @since 8/23/2017
 */
public class Assign7 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double conversionRate;
        int choice;

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        conversionRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        choice = input.nextInt();

        System.out.print(getConversion(choice, conversionRate));


    }

    public static String getConversion(int choice, double conversionRate) {
        switch (choice) {
            case 0:
                double dollars;
                System.out.print("Enter the dollar amount: ");
                dollars = input.nextDouble();
                return "$" + dollars + " is " + dollars * conversionRate + " yuan";

            case 1:
                double yuan;
                System.out.print("Enter the RMB amount: ");
                yuan = input.nextDouble();

                return "$" + yuan + " is " + yuan / conversionRate + " dollars";
            default:
                return "Wrong input, try again? ";
        }
    }



}
