package com.Lab2.Task3;


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

    public void surface_area(){
        System.out.println(2 * (height * width + height * depth + width * depth));
    }

    public void volume() {
        System.out.println(height * width * depth);
    }
}