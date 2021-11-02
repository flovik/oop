package com.Lab5.Task3;

public class C extends B {
    protected String c;

    public C() {

    }

    public C(String c, String x) {
        super("B", x); //dintai se creeaza parintele, apoi obiectul
        this.c = c;
        System.out.println(c);
    }
}
