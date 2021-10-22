package com.nisarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double lab1 = 0;
        double lab2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lab1:");
        do {
            if (lab1 > 10 || lab1 < 0)
                printInvalidData("lab 1");
            lab1 = sc.nextDouble();
        } while (lab1 > 10 || lab1 < 0);


        System.out.println("Enter lab2:");
        do {
            if (lab2 > 10 || lab2 < 0)
                printInvalidData("lab 2");
            lab2 = sc.nextDouble();
        } while (lab2 > 10 || lab2 < 0);


        Student student = new Student();
        student.setStudentName("Jay");
        student.setCourseName("Java");
        student.setLab1(5);
        student.setLab2(2);
        student.setLab3(1);
        student.setLab4(10);
        student.setAssignment1(10);
        student.setAssignment2(10);
        student.setAssignment3(10);
        student.setAssignment4(10);

        System.out.println("total assignment score: " + student.calculateTotalAssignmentScore());
        System.out.println(student.calculateTotalAssignmentScore());
        System.out.println(student.calculateAssignmentScorePercentage());

//        System.out.println(student.displauReportCard());


    }

    private static void printInvalidData(String s) {
        System.out.println("Invalid value for " + s);
        System.out.println("Please enter again");
    }
}
