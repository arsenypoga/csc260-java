package com.nku.csc260.ThirdWeek;

import jdk.nashorn.internal.runtime.Undefined;

import java.util.Scanner;

/**
 * 11th assignment of the 3rd week, of the CSC 260 Course at NKU. Goal: create an app that uses sentient values, prompts
 * user for input. If input is positive, its an Income, if negagtive - a Bill, zero breaks the loop, and ouptuts these
 * values
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign11 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double data;
        double sum = 0;
        double bills = 0;

        System.out.print("Enter bill or income (0 to quit): ");
        data = input.nextDouble();

        while(data != 0) {

            if (data > 0) {
                sum += data;
            } else if (data < 0) {
              bills += data;
            }

            System.out.print("Enter bill or income (0 to quit): ");
            data = input.nextDouble();
        }

        System.out.printf("Total Income: $%f \n Total bills: $%f", sum, Math.abs(bills));

    }



}
