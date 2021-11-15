package com.Lab7.Task2;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4 ,5);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);

        System.out.println("Biggest area: " + FigureController.biggestArea(figures));
        System.out.println("Biggest perimeter: " + FigureController.biggestPerimeter(figures));
    }
}
