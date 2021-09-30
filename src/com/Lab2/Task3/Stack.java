package com.Lab2.Task3;

public class Stack {
    Stack.Node root;
    class Node {
        int val;
        Stack.Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void push(int data){
        Stack.Node node = new Node(data);
        if(root == null)
            root = node;
        else {
            Node temp = root; //set temp as root node
            root = node; //set the current node as root node (top of stack)
            node.next = temp; //set the pointer of current node to the lower node in stack
        }
    }

    public void pop(){
        if(root != null)
            root = root.next;
    }

    public Node peek() {
        if (root == null)
            return null;

        return root;
    }

    public boolean isEmpty(){
        if(root == null)
            return true;

        return false;
    }
}
