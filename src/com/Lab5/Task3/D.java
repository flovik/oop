package com.Lab5.Task3;

public class D extends C {
    protected String d;
    protected X x = new X("Viorica");

    public D() {

    }

    public D(String d, String x) {
        super("C", x); //dintai se creeaza parintele, apoi obiectul
        this.d = d;
        System.out.println(d);
    }
}
