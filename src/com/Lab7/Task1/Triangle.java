package com.Lab7.Task1;

public class Triangle extends Figure {
    public double sideOne;
    public double sideTwo;
    public double sideThree;

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
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
}
