package com.nku.csc260.ForthWeek;

import java.text.MessageFormat;
import java.util.*;

import static java.lang.System.exit;

/**
 * 15th assignment of the 4d week, of the CSC 260 Course at NKU. Goal: create app, that prompts user for input of string
 * of numbers. If numbers are larger than 100, stop the app. After output numbers and times these numbers were inputed.
 *
 * / WARN: Authors Note/ What's the point of the 0 at the end of input ?
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign15 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> numberInput;
        List<String> editedNumberInput = new ArrayList<>();

        System.out.print("Enter the integers between 1 and 100: ");
        numberInput = Arrays.asList(input.nextLine().split(" "));

        for(String number : numberInput) {
            if (Integer.parseInt(number) > 100) {
                System.out.print("Wrong input: Entered number larger than 100!");
                exit(0);
            }

            if (!editedNumberInput.contains(number)) {
                editedNumberInput.add(number);
            }
        }

        for (String number : editedNumberInput) {
            int occurrence = Collections.frequency(numberInput, number);
            if(occurrence > 1) {
                System.out.println(MessageFormat.format("{0} occurs {1} times", number, occurrence));
            } else {
                System.out.println(MessageFormat.format("{0} occurs {1} time", number, occurrence));
            }
        }


    }

    //Iterate through list => pick item, and check for

}
