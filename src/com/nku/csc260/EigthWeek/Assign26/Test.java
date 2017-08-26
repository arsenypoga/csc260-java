package com.nku.csc260.EigthWeek.Assign26;

/**
 * 26th assignment of 8th week, of the CSC 260 Course at NKU.
 *
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name,
 * address, phone number, and email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant. An employee has
 * an office, salary, and date hired. Use the MyDate class defined in Programming
 * Exercise 10.14 to create an object for date hired. A faculty member has office
 * hours and a rank. A staff member has a title. Override the toString method in
 * each class to display the class name and the person’s name.
 * Draw the UML diagram for the classes and implement them. Write a test program
 * that creates a Person, Student, Employee, Faculty, and Staff, and
 * invokes their toString() methods
 *
 * @author Arseny
 * @since 8/25/2017
 */

public class Test {

    public static void main(String[] args) {
        // Test case for Person
        Person person = new Person("Sara Rogers", "Latvia, Riga, Rushonu iela 24", "555-555-555", "kappa@gmail.com");
        System.out.println(person.toString());
        Student student = new Student("freshman", "Jane", "Callahan", "222-2222", "jane@nku.edu");
        System.out.println(student.toString());
        Employee employee = new Employee("GH314", 20000, "January 1, 2017", "John", "Cincinnati", "333-3333", "john@nku.edu");
        System.out.println(employee.toString());
        Faculty faculty = new Faculty("TR2-3", "Professor", "GH510", 100.00, "1/1/2000", "CF", "NKU", "444-4444", "frank@nku.edu");
        System.out.println(faculty.toString());
        // Test case for Staff




    }

}