package com.nku.csc260.FifthWeek;

import java.util.Scanner;

/**
 * 18th assignment of 5th week, of the CSC 260 Course at BKU. Goal: prompt user to input numbers row by row, then sum each
 * column
 *
 * @author Arseny
 * @since 8/24/2017
        */
public class Assign18 {
    public static final int ROW = 3;
    public static final int COLUMN = 4;

    public static void main (String[] args) {
        double[][] matrix = new double[ROW][COLUMN];

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a %d-by-%d matrix row by row: \n", ROW, COLUMN);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for(int i = 0; i < COLUMN;i++) {
            System.out.printf("Sum of the elements at column %d is %f \n", i , sumColumn(matrix, i));
        }

    }

    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }

        return sum;
    }

}
