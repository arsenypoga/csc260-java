package com.nku.csc260.FifthWeek;

import java.util.Scanner;

/**
 * 17th assignment of 5th week, of the CSC 260 Course at NKU. Goal: Wtite program, that promps user for number input,
 * then sorts it using inverse selection sort
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numberArr = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i< numberArr.length;i++) numberArr[i] = input.nextDouble();

        selectionSort(numberArr);

        printArray(numberArr);

    }

public static void selectionSort (double[] arr) {
        double biggest;
        int biggestIndex;

        for (int i = arr.length -1; i > 1; i --) {
            biggest = arr[i];
            biggestIndex = i;


            for(int j = i - 1; j > 0; j--) {

                if (biggest < arr[j]) {
                    biggestIndex = j;
                    biggest = arr[j];
                }
            }

            if (biggestIndex != i) {
                arr[biggestIndex] = arr[i];
                arr[i] = biggest;
            }

        }
}

public static void printArray(double[] arr) {

        for(double item : arr) {
            System.out.printf("%-3s ", item);
        }

}

}