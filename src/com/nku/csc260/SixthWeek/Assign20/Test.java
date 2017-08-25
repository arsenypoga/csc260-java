package com.nku.csc260.SixthWeek.Assign20;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Test {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.set_annualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf(" Balance: %f \n Monthly interest: %f \n Date created: %s", account.get_balance(), account.get_annualInterestRate(), account.getDate());

    }

}
