package com.nku.csc260.EigthWeek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 28th assignment of 8th week, of the CSC 260 Course at NKU.
 *
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays
 * the distinct integers separated by exactly one space.
 * @author Arseny
 * @since 8/25/2017
 */
public class Assign27 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) list.add(input.nextInt());

        removeDuplicate(list);

        System.out.println("The distinct integers are " + list.toString());

    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(newList);
    }
}
