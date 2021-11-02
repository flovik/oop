package com.Lab5.Task3;

public class F extends E {
    protected String f;

    public F() {

    }

    public F(String f, String x) {
        super("E", x); //dintai se creeaza parintele, apoi obiectul
        this.f = f;
        System.out.println(f);
    }
}
