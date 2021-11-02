package com.Lab5.Task3;

public class I extends H {
    protected String i;

    public I() {

    }

    public I(String i, String x) {
        super("H", x); //dintai se creeaza parintele, apoi obiectul
        this.i = i;
        System.out.println(i);
    }
}
