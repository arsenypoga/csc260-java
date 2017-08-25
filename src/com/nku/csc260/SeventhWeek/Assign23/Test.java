package com.nku.csc260.SeventhWeek.Assign23;

import java.util.Arrays;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Test {

    public static void main (String[] args) {
        Course testCourse = new Course("Test Course");

        testCourse.addStudent("John Cena");
        testCourse.addStudent("Kappa Pride");
        testCourse.addStudent("Pepe Kek");

        testCourse.dropStudent("John Cena");

        System.out.println(Arrays.toString(testCourse.getStudents()));
    }

}
