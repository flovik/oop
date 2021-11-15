package com.Lab7.Task3;

import java.util.ArrayList;

public class Triangle extends Figure {
    public double sideOne;
    public double sideTwo;
    public double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getArea() {
        double s = (sideOne + sideTwo + sideThree) / 2.0;
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public void setSide(ArrayList array) {
        sideOne = (double) array.get(0);
        sideTwo = (double) array.get(1);
        sideThree = (double) array.get(2);
    }
}
