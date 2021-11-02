package com.Lab5.Task1;

public class B extends A{
    public String b;

    public B() {
        this("B");
    }

    public B(String b) {
        super(); //dintai se creeaza parintele, apoi obiectul
        this.b = b;
        System.out.println(b);
    }
}
