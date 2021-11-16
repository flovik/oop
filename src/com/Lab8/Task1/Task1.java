package com.Lab8.Task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Parallelepiped par = new Parallelepiped(2, 4, 7);
        Sphere sp = new Sphere(8);
        ArrayList<GeometricBody> figures = new ArrayList<>();
        figures.add(cube);
        figures.add(par);
        figures.add(sp);
    }
}
