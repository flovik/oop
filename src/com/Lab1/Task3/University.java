package com.Lab1.Task3;

public class University {
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
