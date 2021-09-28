package com.Lab1.Task1;
import com.Lab1.Task1.Monitor;
public class Task1 {
    public static void main(String[] args) {
        Monitor LG = new Monitor();
        Monitor AOC = new Monitor();
        LG.color = "black";
        LG.dimension = 5.5;
        LG.width_p = 1920;
        LG.height_p = 1080;
        AOC.color = "gray";
        AOC.dimension = 5.7;
        AOC.width_p = 2560;
        AOC.height_p = 1440;

        System.out.println("LG Monitor is " + LG.color + " color, but AOC Monitor is " + AOC.color);
        System.out.println("Dimension of LG is " + LG.dimension + " inches, but dimension of AOC is " + AOC.dimension + " inches.");
        System.out.println("Resolution of LG Monitor is " + LG.width_p + "x" + LG.height_p
                + ", but resolution of AOC Monitor is " + AOC.width_p + "x" + AOC.height_p);


    }
}
