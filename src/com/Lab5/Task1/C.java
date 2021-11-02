package com.Lab5.Task1;

public class C extends B{
    public String c;

    public C() {
        this("C");
    }

    public C(String c) {
        super();
        this.c = c;
        System.out.println(c);
    }
}
