package com.Lab7.Task3;

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
}
