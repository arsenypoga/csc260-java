package com.nku.csc260.SixthWeek.Assign19;

import java.text.MessageFormat;

/**
 * 19th assignment of 6th week, of the CSC 260 Course at NKU.
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle. The class contains:
 * ■ Two double data fields named width and height that specify the width and
 * height of the rectangle. The default values are 1 for both width and height.
 * ■ A no-arg constructor that creates a default rectangle.
 * ■ A constructor that creates a rectangle with the specified width and height.
 * ■ A method named getArea() that returns the area of this rectangle.
 * ■ A method named getPerimeter() that returns the perimeter.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Rectangle objects—one with width 4 and height 40
 * and the other with width 3.5 and height 35.9. Display the width, height, area,
 * and perimeter of each rectangle in this order
 *
 * @author Arseny
 * @since 8/24/2017
 */
public class Test {

    public static  void main (String[] args) {
        Rectangle firstRectangle = new Rectangle(3.5, 35.9);
        Rectangle secondRectangle = new Rectangle(4, 40);

        System.out.println("firstRectangle width is: " + firstRectangle.width  + " , height is: " + firstRectangle.height + " , area is: " + firstRectangle.getArea() + " , perimeter is: " + firstRectangle.getPerimeter());

        System.out.println("secondRectangle width is: " + secondRectangle .width  + " , height is: " + secondRectangle .height + " , area is: " + secondRectangle .getArea() + " , perimeter is: " + secondRectangle.getPerimeter());

    }



}
