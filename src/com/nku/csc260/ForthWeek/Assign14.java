package com.nku.csc260.ForthWeek;

/**
 * 14th assignment of the 4d week, of the CSC 260 Course at NKU. Goal:Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player. Here are some sample runs.
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Assign14 {


    public static void main(String[] args) {
        int point;
        int roll;

        //Roll dice
        roll = getSum();

        //Default win conditions
        if (roll == 7 || roll == 11 ) System.out.println("You win!");
        // Default loss conditions
        else if (roll == 2 || roll == 3 || roll == 12) System.out.println("You loose!");
        //When any other number is rolled
        else {
            // Establish point
            point = roll;
            System.out.println("Point is " + point);

            do {
                roll = getSum();

            } while (roll != point && roll != 7);

            if (roll == 7) System.out.println("You loose");
            if (roll == point) System.out.println("You win!");
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

        return (int) (Math.random() * 6 + 1);
    }

}
