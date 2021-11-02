package com.Lab5.Task2;

public class G extends F {
    protected String g;

    public G() {

    }

    public G(String g, String x) {
        super("F", x); //dintai se creeaza parintele, apoi obiectul
        this.g = g;
        System.out.println(g);
    }
}
