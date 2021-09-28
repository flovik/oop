package com.Lab1.Task2;

public class Student {
    public String last_name;
    public String first_name;
    public int age;
    public double mark_math;
    public double mark_sda;
    public double mark_oop;

    public Student(String fn, String ln, int a, double m_math, double m_sda, double m_oop){
        first_name = fn;
        last_name = ln;
        age = a;
        mark_math = m_math;
        mark_sda = m_sda;
        mark_oop = m_oop;
    }
}
