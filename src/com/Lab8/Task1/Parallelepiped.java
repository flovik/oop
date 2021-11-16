package com.Lab8.Task1;

public class Parallelepiped extends GeometricBody{
    public double a;
    public double b;
    public double c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurface() {
        return 2 * a * b + 2 * a * c + 2 * b * c;
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }
}
