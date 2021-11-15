package com.Lab7.Task2;

import java.util.ArrayList;

public class FigureController {
    static double biggestArea(ArrayList<Figure> figures) {
        double maxArea = 0;
        for(Figure figure : figures) {
            double tempArea = figure.getArea();
            if(maxArea < tempArea) maxArea = tempArea;
        }

        return maxArea;
    }

    static double biggestPerimeter(ArrayList<Figure> figures) {
        double maxPerimeter = 0;
        for(Figure figure : figures) {
            double tempPerimeter = figure.getPerimeter();
            if(maxPerimeter < tempPerimeter) maxPerimeter = tempPerimeter;
        }

        return maxPerimeter;
    }
}
