package com.Lab7.Task1;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);
    }
}
