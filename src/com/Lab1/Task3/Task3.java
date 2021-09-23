package com.Lab1.Task3;

public class Task3 {

    public static void main(String[] args) {
        Student student1 = new Student("Mustuc", "Mihai", 20, 9, 8, 6);
        Student student2 = new Student("Baclajan", "Marcel", 20, 10, 9, 10);
        Student student3 = new Student("Florea", "Viorel", 20, 8, 8, 8);
        University university_UTM = new University("UTM", 1967);
        university_UTM.studentList = new Student[3];
        university_UTM.studentList[0] = student1;
        university_UTM.studentList[1] = student2;
        university_UTM.studentList[2] = student3;

        Student student4 = new Student("Kim", "Mihai", 22, 10, 10, 10);
        Student student5 = new Student("Badarajan", "Arghiu", 19, 4, 5, 6);
        Student student6 = new Student("Sandu", "Alex", 27, 3, 8, 6);
        University university_USM = new University("USM", 1970);
        university_USM.studentList = new Student[3];
        university_USM.studentList[0] = student4;
        university_USM.studentList[1] = student5;
        university_USM.studentList[2] = student6;

        Student student7 = new Student("Vioara", "Violeta", 23, 5, 4, 9);
        Student student8 = new Student("Baclajan", "Costea", 22, 5, 5, 5);
        Student student9 = new Student("Baretkii", "Stas", 21, 6, 7, 8);
        Student student10 = new Student("Crasca", "Artur", 23, 7, 3, 5);
        University university_AGRARA = new University("Agrara", 1945);
        university_AGRARA.studentList = new Student[4];
        university_AGRARA.studentList[0] = student7;
        university_AGRARA.studentList[1] = student8;
        university_AGRARA.studentList[2] = student9;
        university_AGRARA.studentList[3] = student10;

        university_UTM.CalculateMedia();
        university_USM.CalculateMedia();
        university_AGRARA.CalculateMedia();

        double average = (university_UTM.media + university_USM.media + university_AGRARA.media) / 3;
        System.out.println("Media universitatilor: " + average);
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
    double media;

    University(String n, int fy) {
        name = n;
        foundationYear = fy;
    }

    public void CalculateMedia(){
        for(int i = 0; i < studentList.length; i++) {
            media +=  (studentList[i].mark_math + studentList[i].mark_sda + studentList[i].mark_oop) / 3;
        }
        media /= studentList.length;
    }
}