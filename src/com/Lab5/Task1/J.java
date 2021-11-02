package com.Lab5.Task1;

final public class J extends I{ //final nu se mai mosteneste de la aista
    public String j;

    public J() {
        this("J");
    }

    public J(String j) {
        super();
        this.j = j;
        System.out.println(j);
    }
}
