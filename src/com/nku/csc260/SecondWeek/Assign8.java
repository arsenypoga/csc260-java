package com.nku.csc260.SecondWeek;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 8th assignment of the 2nd week, of the CSC 260 Course at NKU. Goal: To convert letter grade to a number
 *
 * @author Arseny
 * @since 8/23/2017
 */
public class Assign8 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letterGrade;
        char [] LETTER_GRADE_ARRAY = new char[] {'A', 'B', 'C', 'D', 'F'};
        int[] NUMBER_GRADE_ARRAY = new int[] {4, 3, 2, 1, 0};

        System.out.print("Enter a letter grade: ");
        letterGrade = input.next().toUpperCase().charAt(0);

        System.out.println(getLetterGrade(LETTER_GRADE_ARRAY, NUMBER_GRADE_ARRAY, letterGrade));

    }

    public static String getLetterGrade(char[] gradeArray, int[] numberArray, char letterGrade) {
        // Converts array of items, to a List object, that has desired .contains method
        if(Arrays.asList(gradeArray).contains(letterGrade)) {
            return MessageFormat.format("The numeric value for grade {0} is {1}",letterGrade,
                    numberArray[Arrays.asList(gradeArray).indexOf(letterGrade)] );
        } else {
            return MessageFormat.format("{0} is a wrong input", letterGrade);
        }
    }

}
