package com.Lab5.Task3;

public abstract class A {
    protected String a;
    protected X x = new X("Viorel");

    public A() {

    }

    public A(String a, String x) {
        this.a = a;
        this.x = new X(x); //when creating another object and changing the reference, the previous "Viorel"
                        //will remain without reference and collected by the garbage collector
        System.out.println(a);
    }

}
