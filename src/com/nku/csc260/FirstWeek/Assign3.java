package com.nku.csc260.FirstWeek;

import java.util.Scanner;

/**
 * 3rd assignment of the 1st week, of the CSC 260 Course at BKU. Goal: to create a program that asks for user input of Fahrenheit and
 * converts it to Celsius
 *
 * Page 69 #2.1.
 *
 * @author Arseny
 * @since 8/22/2017
 */


public class Assign3 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");

        double degrees = input.nextDouble();

        System.out.println(degrees + " Celsius is " + celsiusToFahrenheit(degrees) + " Fahrenheit");
    }

    public static double celsiusToFahrenheit (double degrees) {

        return ((9.0/5) * degrees + 32);
    }

}
