package com.nku.csc260.SeventhWeek.Assign23;


/**
 * 23d assignment of the 7nd week, of the CSC 260 Course at NKU.
 *
 *(The Course class) Revise the Course class as follows:
 * ■ The array size is fixed in Listing 10.6. Improve it to automatically increase
 * the array size by creating a new larger array and copying the contents of the
 * current array to it.
 * ■ Implement the dropStudent method.
 * ■ Add a new method named clear() that removes all students from the
 * course.
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
        
        System.out.println(" ------------ ");
        
        System.out.printf("%s has %d students\n",testCourse.getCourseName(), testCourse.getNumberOfStudents() );

        for (int i = 0; i < testCourse.getStudents().length; i++) {
        	System.out.println(testCourse.getStudents()[i]);
        }
    }

}
