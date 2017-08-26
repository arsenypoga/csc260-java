package com.nku.csc260.EigthWeek.Assign25;

import com.nku.csc260.EigthWeek.Assign25.SimpleGeometricObject;

public class Triangle extends SimpleGeometricObject {
// Fill in the code
    private double _side1;
    private double _side2;
    private double _side3;

        public Triangle(){
            this._side1 = 1.0;
            this._side2 = 1.0;
            this._side3 = 1.0;
        }
        public Triangle(double side1, double side2, double side3){
            this._side1 = side1;
            this._side2 = side2;
            this._side3 = side3;
        }

        public double getSide1(){
            return this._side1;
        }

        public double getSide2(){
            return this._side2;
        }

        public double getSide3(){
            return this._side3;
        }

        // write the method getArea()


        public double getArea() {
            // Herons formula
            double S = this._side1 + this._side2 + this._side3 / 2;
            return Math.sqrt(S * (S - this._side1) * (S - this._side2) + (S - this._side3));
        }


        public double getPerimeter(){
            return this._side1 + this._side2 + this._side3;
        }

        // write the method toString()
        public String toString() {
            return "Triangle: side1 = " + this._side1 + " side2 = " + this._side2 + " side3 = " + this._side3;
        }


}