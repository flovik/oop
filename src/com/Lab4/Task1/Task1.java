package com.Lab4.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/Lab4/Task1/one_expression.txt");
        Scanner scan = new Scanner(file);

        MathParser mp = new MathParser();

        while(scan.hasNextLine()) {
            String temp = scan.nextLine();
            if(mp.isCorrect(temp)) System.out.println("Mathematical expression is correct!");
            else System.out.println("Mathematical expression is incorrect!");
        }
    }
}
