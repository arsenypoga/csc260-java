package com.nku.csc260.SixthWeek.Assign21;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 21st assignment of 6th week, of the CSC 260 Course at NKU.
 * Assignment link: http://sappho.nku.edu/~frank/CSC260/Assn/Assignment21.pdf
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class TestBMI {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatNumbers = new DecimalFormat("###.##");
        BMI tester;

        int userWeight;
        int userHeight;

        // Get user weight; Pounds
        System.out.print("Enter your weight in pounds: ");
        userWeight = input.nextInt();

        // Get user height; Inches
        System.out.print("Enter your height in inches: ");
        userHeight = input.nextInt();

        // Initialize tester with user height and weight
        tester = new BMI(userHeight, userWeight);

        System.out.printf("BMI = %s \n", formatNumbers.format(Math.round(tester.getBMI() * 100.0) / 100.0));

        System.out.printf("Your maximum desired weight is: %d \n", tester.getMaxWeight());

        // Set desired weight
        System.out.print("What is your desired weight? : ");
        tester.setWeight(input.nextInt());
        System.out.printf("Your BMI will be : %s", formatNumbers.format(Math.round(tester.getBMI() * 100.0) / 100.0));

    }



}
