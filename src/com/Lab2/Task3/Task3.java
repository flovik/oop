package com.Lab2.Task3;

public class Task3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(2, 5 ,7);

        System.out.print("Surface area of a box with no parameters:  ");
        box1.surface_area();
        System.out.print("Volume of a box with no parameters:  ");
        box1.volume();

        System.out.print("Surface area of a box with 1 parameter:  ");
        box2.surface_area();
        System.out.print("Volume of a box with 1 parameter:  ");
        box2.volume();

        System.out.print("Surface area of a box with 3 parameters:  ");
        box3.surface_area();
        System.out.print("Volume of a box with 3 parameters:  ");
        box3.volume();
        Queue q1 = new Queue();
        Queue q2 = new Queue(3);
        System.out.println("Is queue1 empty? " + q1.isEmpty());
        q1.push(2);
        System.out.println("Is queue1 empty? " + q1.isEmpty());
        q1.push(3);
        q1.push(5);
        q1.isFull();
        System.out.println("Is queue1 empty? " + q1.isEmpty());

        System.out.println("Is queue2 empty? " + q2.isEmpty());
        q2.push(10);
        System.out.println("Is queue2 empty? " + q2.isEmpty());
        q2.isFull();
        q2.push(20);
        q2.isFull();
        q2.push(30);
        q2.isFull();
        q2.push(40);
        System.out.println("Is queue2 empty? " + q2.isEmpty());
    }
}
