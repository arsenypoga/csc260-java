package com.nku.csc260.SixthWeek.Assign19;

import java.text.MessageFormat;

/**
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
