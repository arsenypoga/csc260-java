package com.nku.csc260.SecondWeek;

import java.util.Scanner;

/**
 * 6th assignment of the 2nd week, of the CSC 260 Course at NKU. Goal: to create an app that asks for the a,b and c of
 * the function, and outputs if the function has 2, 1, or no real roots
 *
 * Page 108 #3.1.
 *
 * @author Arseny
 * @since 8/23/2017
 */
public class Assign6 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        System.out.println(getRoots(a, b, c));
    }


    public static String getRoots(double a, double b, double c) {
        if (getDiscriminant(a, b, c) > 0) {

            double firstRoot = (-b + Math.sqrt(getDiscriminant(a, b, c)))/2 * a;
            double secondRoot = (-b - Math.sqrt(getDiscriminant(a, b, c)))/2 * a;
            return "The Equation has two roots " + firstRoot + " and " + secondRoot;

        } else if (getDiscriminant(a, b, c) == 0) {

            return "The equation has one root " + (-b + Math.sqrt(getDiscriminant(a, b, c)))/2 * a;

        }
        return "The equation has no real roots";
    }

    public static double getDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

}
