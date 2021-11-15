package com.Lab7.Task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Figure circle = new Figure() {
            public double radius;

            @Override
            public double getArea() {
                return radius * radius * Math.PI;
            }

            @Override
            public double getPerimeter() {
                return 2 * radius * Math.PI;
            }

            @Override
            public void setSide(ArrayList array) {
                this.radius = (double) array.get(0);
            }
        };
        ArrayList array = new ArrayList();
        array.add(12.5);
        circle.setSide(array);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        Square square = new Square(12);
        Rectangle rectangle = new Rectangle(10, 6);
        Triangle triangle = new Triangle(3, 7 ,5);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);
        figures.add(circle);
        System.out.println("Biggest area: " + FigureController.biggestArea(figures));
    }
}
