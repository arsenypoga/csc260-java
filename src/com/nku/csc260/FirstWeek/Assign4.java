package com.nku.csc260.FirstWeek;

import java.util.Scanner;

/**
 * 4rd assignment of the 1st week, of the CSC 260 Course at BKU. Goal is to create an app that asks for user input of pounds, and
 * converts them to Kilograms
 *
 * Page 70 #2.4.
 *
 * @author Arseny
 * @since 8/22/2017
 */


public class Assign4 {

    // Constant Pounds per Kilogram
    public static final double POUNDS_PER_KILOGRAM = 0.454;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds;

        System.out.print("Enter a number of pounds: ");
        pounds = input.nextDouble();
        System.out.println(pounds + " pounds is  " + poundsToKilograms(pounds) + " kilograms");
    }


    public static double poundsToKilograms (double pounds) {
        return pounds * POUNDS_PER_KILOGRAM;
    }
}
