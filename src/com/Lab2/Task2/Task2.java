package com.Lab2.Task2;
import com.Lab2.Task2.Queue;
public class Task2 {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        Queue q2 = new Queue(2);
        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.pop();
        q1.pop();
        q1.peek();

        q2.push(5);
        q2.push(15);
        q2.push(25);
        q2.pop();
        q2.peek();

    }
}
