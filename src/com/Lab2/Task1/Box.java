package com.Lab2.Task1;

public class Box {
    public int height;
    public int width;
    public int depth;

    Box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    Box(int all){
        height = all;
        width = all;
        depth = all;
    }

    Box(int h, int w, int d){
        height = h;
        width = w;
        depth = d;

    }
}
