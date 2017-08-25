package com.nku.csc260.SixthWeek.Assign21;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class BMI {
    private double _height;
    private double _weight;

    public static final double KILOGRAMS_PER_POUND =  0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    BMI (double height, double weight) {
        this._height = height * METERS_PER_INCH;
        this._weight = weight * KILOGRAMS_PER_POUND;
    }

    public double getBMI () {
        return (this._weight) / Math.pow(this._height, 2);
    }

    public long getMaxWeight() {
        return Math.round((25 * Math.pow(this._height, 2)) / KILOGRAMS_PER_POUND);
    }

    public void setWeight(double pounds) {
        this._weight = pounds * KILOGRAMS_PER_POUND;
    }

}
