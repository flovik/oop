package com.Lab8.Task3;

public class Sphere implements IGeometricBody {
    public double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * radius * radius * radius / 3.0;
    }
}
