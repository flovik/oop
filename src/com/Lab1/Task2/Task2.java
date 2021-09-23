package com.Lab1.Task2;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Mustuc", "Mihai", 20, 9, 8, 6);
        Student student2 = new Student("Baclajan", "Marcel", 20, 10, 9, 10);
        Student student3 = new Student("Florea", "Viorel", 20, 8, 8, 8);
        University university_UTM = new University("UTM", 1967);
        university_UTM.studentList = new Student[3];
        university_UTM.studentList[0] = student1;
        university_UTM.studentList[1] = student2;
        university_UTM.studentList[2] = student3;
    }
}


class Student {
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

class University {
    public String name;
    public int foundationYear;
    Student[] studentList;

    University(String n, int fy) {
        name = n;
        foundationYear = fy;
    }
}