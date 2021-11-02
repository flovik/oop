package com.Lab5.Task2;

public class D extends C {
    protected String d;

    public D() {

    }

    public D(String d, String x) {
        super("C", x); //dintai se creeaza parintele, apoi obiectul
        this.d = d;
        System.out.println(d);
    }
}
