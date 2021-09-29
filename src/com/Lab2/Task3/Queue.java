package com.Lab2.Task3;

import com.Lab2.Task3.Stack;

public class Queue {
    Stack st1;
    Stack st2;
    int numbers;
    int current_numbers;
    Queue() {
        st1 = new Stack();
        st2 = new Stack();
        numbers = Integer.MAX_VALUE;
        current_numbers = -1;
    }

    Queue(int val){
        st1 = new Stack();
        st2 = new Stack();
        numbers = val;
        current_numbers = 0;
    }

    public void push(int val){
        if(current_numbers == numbers){
            System.out.println("You've reached the limit of numbers in the queue!");
            return;
        }

        while(!st1.isEmpty()){
            st2.push(st1.peek().val);
            st1.pop();
        }
        st1.push(val);
        while(!st2.isEmpty()){
            st1.push(st2.peek().val);
            st2.pop();
        }
        if (current_numbers != -1) current_numbers++;
    }

    public void pop(){
        st1.pop();
        if(current_numbers > 0) current_numbers--;
    }

    public void peek(){
        if(st1.peek() != null) System.out.println(st1.peek().val);
        else System.out.println("Queue is empty");
    }

    public boolean isEmpty(){
        return st1.isEmpty();
    }
    public void isFull() {
        if(current_numbers == -1) System.out.println("Queue is never full");
        else System.out.println("You used " + current_numbers + " chunks of space out of " + numbers + " total");
    }
}
