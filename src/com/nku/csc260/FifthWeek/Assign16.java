package com.nku.csc260.FifthWeek;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * 16th assignment of 5th week, of the CSC 260 Course at BKU. Goal: Create a program, that promps user to enter 10
 * numbers, and finds the smallest number
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] inputArr = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i< inputArr.length;i++) inputArr[i] = input.nextDouble();

        if (inputArr.length != 10) {
            System.out.print("Please input exaxctly 10 numbers!");
            exit(0);
        }

        System.out.println("The Minimum number is " + getSmallestElement(inputArr));
    }

    public static double getSmallestElement (double[] arr) {
        double smallest = arr[0];

        for (double number : arr) {
            if (smallest > number) {
                smallest = number;
            }
        }
    return smallest;
    }
}
