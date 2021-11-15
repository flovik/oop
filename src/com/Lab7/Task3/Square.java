package com.Lab7.Task3;

import java.util.ArrayList;

public class Square extends Figure {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void setSide(ArrayList array) {
        side = (double) array.get(0);
    }
}
