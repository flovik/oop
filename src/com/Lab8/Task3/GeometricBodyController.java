package com.Lab8.Task3;
import java.util.ArrayList;

public class GeometricBodyController {
    static double biggestSurface(ArrayList<IGeometricBody> figures) {
        double maxSurface = 0;
        for(IGeometricBody figure : figures) {
            double tempSurface = figure.getSurface();
            if(maxSurface < tempSurface) maxSurface = tempSurface;
        }

        return maxSurface;
    }

    static double biggestVolume(ArrayList<IGeometricBody> figures) {
        double maxVolume = 0;
        for(IGeometricBody figure : figures) {
            double tempVolume = figure.getVolume();
            if(maxVolume < tempVolume) maxVolume = tempVolume;
        }

        return maxVolume;
    }
}
