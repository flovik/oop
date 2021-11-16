package com.Lab8.Task2;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Cube cube = new Cube(7);
        Parallelepiped par = new Parallelepiped(3, 8, 7);
        Sphere sp = new Sphere(8);
        ArrayList<GeometricBody> figures = new ArrayList<>();
        figures.add(cube);
        figures.add(par);
        figures.add(sp);

        System.out.println("Biggest surface: " + GeometricBodyController.biggestSurface(figures));
        System.out.println("Biggest volume: " + GeometricBodyController.biggestVolume(figures));
    }
}
