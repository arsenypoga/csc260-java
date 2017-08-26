package com.nku.csc260.SecondWeek;

import java.util.Scanner;

/**
 * 5th assignment of the 2nd week, of the CSC 260 Course at NKU. Goal: Create an app that asks for the input of the weight
 * in pounds, and height in inches, then converts it to the SI system orf Units, and outputs the BMI
 *
 * Page 72 #2.14.
 *
 * @author Arseny
 * @since 8/22/2017
 */

public class Assign5 {

    public static final double KILOGRAMS_PER_POUND =  0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public static void main (String[] args) {
        Scanner input =  new Scanner(System.in);
        // Scanner heightInput =  new Scanner(System.in);
        double pounds;
        double inches;

        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();

        System.out.println("BMI is " + getBMI(pounds, inches));

    }

    // Not sure if iches should be int or double, stupid Imperical system
    public static double getBMI(double pounds, double inches) {

        double kilograms = pounds * KILOGRAMS_PER_POUND;
        double meters = inches * METERS_PER_INCH;

        return kilograms / Math.pow(meters, 2);

    }

}
