package com.Lab5.Task2;

final public class J extends I { //final nu se mai mostenesc de la aista
    protected String j;

    public J() {

    }

    public J(String j, String x) {
        super("I", x); //dintai se creeaza parintele, apoi obiectul
        this.j = j;
        System.out.println(j);
    }
}
