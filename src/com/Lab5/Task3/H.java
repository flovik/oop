package com.Lab5.Task3;

public class H extends G {
    protected String h;
    final private X x = new X("Victoria");

    public H() {

    }

    public H(String h, String x) {
        super("G", x); //dintai se creeaza parintele, apoi obiectul
        this.h = h;
        System.out.println(h);
    }
}
