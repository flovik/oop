package com.Lab1.Task2;
import com.Lab1.Task2.Student;
import com.Lab1.Task2.University;
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
