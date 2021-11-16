package com.Lab8.Task2;

import com.Lab7.Task2.Figure;

import java.util.ArrayList;

public class GeometricBodyController {
    static double biggestSurface(ArrayList<GeometricBody> figures) {
        double maxSurface = 0;
        for(GeometricBody figure : figures) {
            double tempSurface = figure.getSurface();
            if(maxSurface < tempSurface) maxSurface = tempSurface;
        }

        return maxSurface;
    }

    static double biggestVolume(ArrayList<GeometricBody> figures) {
        double maxVolume = 0;
        for(GeometricBody figure : figures) {
            double tempVolume = figure.getVolume();
            if(maxVolume < tempVolume) maxVolume = tempVolume;
        }

        return maxVolume;
    }
}
