package com.Lab5.Task3;

public class E extends D {
    protected String e;

    public E() {

    }

    public E(String e, String x) {
        super("D", x); //dintai se creeaza parintele, apoi obiectul
        this.e = e;
        System.out.println(e);
    }
}
