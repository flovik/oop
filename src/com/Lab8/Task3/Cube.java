package com.Lab8.Task3;

public class Cube implements IGeometricBody {
    public double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}
