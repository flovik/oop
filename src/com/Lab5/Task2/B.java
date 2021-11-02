package com.Lab5.Task2;

public class B extends A {
    protected String b;

    public B() {

    }

    public B(String b, String x) {
        super("A", x); //dintai se creeaza parintele, apoi obiectul
        this.b = b;
        System.out.println(b);
    }
}
