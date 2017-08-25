package com.nku.csc260.ForthWeek;

/**
 * 14th assignment of the 4d week, of the CSC 260 Course at NKU. Goal: create an app that simulates game craps
 * User rolls two dices, if sum of dices is 7 or 11, user wins. If user rolls 2, 3, 12, user looses. In any other case
 * the number rolled, is counted as points. User has to roll dice again, and get same roll, as the points. If user succeeds
 * he wins, if he doesn't he looses
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign14 {

    public static void main(String[] args) {
        int point;
        int roll;

            roll = getSum();

            if (roll == 7 || roll == 11 ) {
                System.out.println("You win!");
            } else if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You loose!");
            } else {

                point = roll;

                System.out.println("Point is " + point);

                roll = getSum();
                if (roll == 7 || point != roll) {
                    System.out.println("You loose!");
                } else if (point == roll) {
                    System.out.printf("You win!");
                }
            }

    }

    public static int getSum() {
        int firstRoll = rollDice();
        int secondRoll = rollDice();
        int sum = firstRoll + secondRoll;
        System.out.println("You rolled " + firstRoll + " + " + secondRoll + " = " + sum);
        return sum;
    }

    public static int rollDice() {
        return 1 + (int)Math.round(5 * Math.random());
    }

}
