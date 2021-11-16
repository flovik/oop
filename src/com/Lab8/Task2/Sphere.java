package com.Lab8.Task2;

public class Sphere extends GeometricBody {
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
