package com.nku.csc260.SecondWeek;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * 9th assignment of the 2nd week, of the CSC 260 Course at NKU. Goal: create an app, that converts American dates, to
 * European dates
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign9 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an American date: ");

        System.out.println(convertDates(input.nextLine()));

    }

    public static String convertDates(String americanDate) {
        String[] newDate = americanDate.split(" ");

        return MessageFormat.format("European date is: {0} {1} {2}", newDate[1].replace(",", ""), newDate[0], newDate[2]);
    }

}
