package com.nku.csc260.SeventhWeek.Assign23;


/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Test {

    public static void main (String[] args) {
        Course testCourse = new Course("Test Course");
        
        System.out.printf("%s has %d students\n",testCourse.getCourseName(), testCourse.getNumberOfStudents() );

        for (int i = 0; i < testCourse.getStudents().length; i++) {
        	System.out.println(testCourse.getStudents()[i]);
        }
        
        testCourse.dropStudent("First student");
        
        System.out.println(" // ");
        
        System.out.printf("%s has %d students\n",testCourse.getCourseName(), testCourse.getNumberOfStudents() );

        for (int i = 0; i < testCourse.getStudents().length; i++) {
        	System.out.println(testCourse.getStudents()[i]);
        }
    }

}
