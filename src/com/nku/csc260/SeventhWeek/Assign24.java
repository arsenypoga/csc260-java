package com.nku.csc260.SeventhWeek;


import com.nku.csc260.SixthWeek.Assign20.Account;

import java.util.Scanner;

/**
 * 23d assignment of the 7nd week, of the CSC 260 Course at NKU.
 *
 *(Game: ATM machine) Use the Account class created in Programming Exercise
 * 9.7 to simulate an ATM machine. Create ten accounts in an array with id
 * 0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
 * id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
 * is accepted, the main menu is displayed as shown in the sample run. You can
 * enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
 * depositing money, and 4 for exiting the main menu. Once you exit, the sy
 *
 * @author Arseny
 * @since 8/25/2017
 */
public class Assign24 {

    public static void main (String[] args) {
        Account[] accountList;
        Scanner input = new Scanner(System.in);
        boolean isIDCorrect = false;
        boolean isMenuActive = false;
        int selectedID = 0;

        accountList = accountFactory(10);

        while(true) {

            while(!isIDCorrect) {
                System.out.print("Enter an id: ");
                selectedID = input.nextInt();

                if (selectedID <= accountList.length) {
                    isIDCorrect = true;
                    isMenuActive = true;
                } else {
                    System.out.println(" Id is incorrect! Try again! ");
                }
            }

            while (isIDCorrect && isMenuActive) {
                System.out.print(
                        "Main menu \n" +
                        "1: Check balance \n" +
                        "2: Withdraw \n" +
                        "3: Deposit \n" +
                        "4: Exit \n" +
                        "Enter a choice: ");

                switch(input.nextInt()) {
                    case 1:
                        System.out.println("The balance is: " + accountList[selectedID].get_balance() + "\n");
                        break;
                    case 2:
                        System.out.print("Enter number to withdraw: ");
                        accountList[selectedID].withdraw(input.nextDouble());
                        System.out.print("\n");
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        accountList[selectedID].deposit(input.nextDouble());
                        System.out.print("\n");
                        break;
                    case 4:
                        isMenuActive = false;
                        isIDCorrect = false;
                        break;
                    default:
                        System.out.println("Wrong input|! Try again? ");
                }

            }

        }


    }

    public static Account[] accountFactory (int num) {
        Account[] accountArr = new Account[num-1];

        for (int i = 0;i < num-1; i++) {
            accountArr[i] = new Account(i, 100);
        }

        return accountArr;
    }

}
