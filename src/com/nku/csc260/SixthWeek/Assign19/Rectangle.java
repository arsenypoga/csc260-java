package com.nku.csc260.SixthWeek.Assign19;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Rectangle {

    double width = 1;
     double height = 1;

    Rectangle () {
        //TODO: Create default rectangle, whatever it takes
    }

    Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

}
