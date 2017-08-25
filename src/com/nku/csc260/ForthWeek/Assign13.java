package com.nku.csc260.ForthWeek;

/**
 * 13th assignment of the 4d week, of the CSC 260 Course at NKU. Goal: create an app that uses method to convert celsius
 * to fahrenheit. Call method repeatedly to print the output
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign13 {

    public static void main(String[] args) {

        runMethodGivenTimes(7, 5);

    }

    public static double celsiusToFahrenheit (double degrees) {

        return ((9.0/5) * degrees + 32);
    }

    public static void runMethodGivenTimes(int times, int margin) {
        final String TABLE_FORMAT = "%-10s %-10s \n";
        int degrees = 0;
        System.out.printf(TABLE_FORMAT, "Celsius", "Fahrenheit");

        for (int i = 1; i <= times; i++) {
            System.out.printf(TABLE_FORMAT, degrees, Math.round(celsiusToFahrenheit(degrees)));
            degrees += margin;
        }
    }


}
