package com.nku.csc260.ThirdWeek;

import java.text.MessageFormat;

/**
 * 10th assignment of the 3rd week, of the CSC 260 Course at NKU. Goal: create a table, that uses while loop to iterate
 * through temperature from 0, by 5, to 30 Celsius and display fahrenheit correspondingly
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign10 {

    public static void main(String[] args) {
        final String TABLE_FORMAT = "%-15s %-15s %n";
        int celsius = 0;
        System.out.printf(TABLE_FORMAT, "Celsius", "Fahrenheit");

        while(celsius <= 30) {

            System.out.printf(TABLE_FORMAT, Math.round(celsius), Math.round((9.0/5) * celsius + 32));

            celsius += 5;
        }
    }

}
