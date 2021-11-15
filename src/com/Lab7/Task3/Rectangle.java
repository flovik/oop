package com.Lab7.Task3;

import java.util.ArrayList;

public class Rectangle extends Figure {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void setSide(ArrayList array) {
        length = (double) array.get(0);
        width = (double) array.get(0);
    }
}
