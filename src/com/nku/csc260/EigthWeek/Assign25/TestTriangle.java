package com.nku.csc260.EigthWeek.Assign25;

/**
 * 25th assignment of 8th week, of the CSC 260 Course at NKU.
 *
 *(The Triangle class) Design a class named Triangle that extends
 * GeometricObject. The class contains:
 * ■ Three double data fields named side1, side2, and side3 with default
 * values 1.0 to denote three sides of the triangle.
 * ■ A no-arg constructor that creates a default triangle.
 * ■ A constructor that creates a triangle with the specified side1, side2, and
 * side3.
 * ■ The accessor methods for all three data fields.
 * ■ A method named getArea() that returns the area of this triangle.
 * ■ A method named getPerimeter() that returns the perimeter of this triangle.
 * ■ A method named toString() that returns a string description for the triangle.
 *
 * @author Arseny
 * @since 8/25/2017
 */
public class TestTriangle {

    public static void main(String[] args) {
        Triangle defaultTriangle = new Triangle();
        Triangle firstTriangle = new Triangle(5, 20, 49);

        getTriangleData(defaultTriangle, "<defaultTriangle>");
        defaultTriangle.setColor("red");
        defaultTriangle.setFilled(true);
        getTriangleData(defaultTriangle, "<defaultTriangle>");


        getTriangleData(firstTriangle, "<firstTriangle>");

        firstTriangle.setFilled(true);
        firstTriangle.setColor("Blue");

        getTriangleData(firstTriangle, "<firstTriangle>");

    }


    public static void getTriangleData(Triangle tri, String name) {
        System.out.print(name + "\nColor: " + tri.getColor() + "\nFilled: "
                + tri.isFilled() + "\nCreated at: " + tri.getDateCreated() + "\n" + tri.toString() + "\nArea: "
                + tri.getArea() + "\nPerimeter" + tri.getPerimeter() + "\n\n");
    }

}
