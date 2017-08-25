package com.nku.csc260.SeventhWeek.Assign22;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Test {

    public static final String TIME_FORMAT = "%d:%d:%d";

    public static void main (String[] args) {

        Time clock_1 = new Time();


        System.out.printf(TIME_FORMAT, clock_1.getHours(), clock_1.getMinutes(), clock_1.getSeconds());
    }

}
