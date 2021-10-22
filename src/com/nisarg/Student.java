package com.nisarg;

public class Student {
    String studentName;
    String courseName;
    //labs
    EvaluationItem lab1;
    EvaluationItem lab2;
    EvaluationItem lab3;
    EvaluationItem lab4;
    EvaluationItem lab5;
    //Assignments
    EvaluationItem assignment1;
    EvaluationItem assignment2;
    EvaluationItem assignment3;
    EvaluationItem assignment4;
    //Exams
    EvaluationItem exam1;
    EvaluationItem exam2;

    final double LAB_MAX_SCORE = 10;
    final double ASSIGNMENT_MAX_SCORE = 20;
    final double EXAMS_MAX_SCORE = 10;

    public Student() {
        studentName = "Jay";
        courseName = "java";
        lab1 = new EvaluationItem();
        lab2 = new EvaluationItem();
        lab3 = new EvaluationItem();
        lab4 = new EvaluationItem();
        lab5 = new EvaluationItem();

        assignment1 = new EvaluationItem();
        assignment2 = new EvaluationItem();
        assignment3 = new EvaluationItem();
        assignment4 = new EvaluationItem();

        exam1 = new EvaluationItem();
        exam2 = new EvaluationItem();

    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public EvaluationItem getLab1() {
        return lab1;
    }

    public void setLab1(double score) {
        lab1.setName("Lab 1");
        lab1.setMaxScore(LAB_MAX_SCORE);
        lab1.setScoreObtained(score);
    }

    public EvaluationItem getLab2() {
        return lab2;
    }

    public void setLab2(double score) {
        lab2.setName("Lab 2");
        lab2.setMaxScore(LAB_MAX_SCORE);
        lab2.setScoreObtained(score);
    }

    public EvaluationItem getLab3() {
        return lab3;
    }

    public void setLab3(double score) {
        lab3.setName("Lab 3");
        lab3.setMaxScore(LAB_MAX_SCORE);
        lab3.setScoreObtained(score);
    }

    public EvaluationItem getLab4() {
        return lab4;
    }

    public void setLab4(double score) {
        lab4.setName("Lab 4");
        lab4.setMaxScore(LAB_MAX_SCORE);
        lab4.setScoreObtained(score);
    }

    public EvaluationItem getLab5() {
        return lab4;
    }

    public void setLab5(double score) {
        lab5.setName("Lab 5");
        lab5.setMaxScore(LAB_MAX_SCORE);
        lab5.setScoreObtained(score);
    }

    public EvaluationItem getAssignment1() {
        return assignment1;
    }

    public void setAssignment1(double score) {
        assignment1.setName("Assignment 1");
        assignment1.setMaxScore(ASSIGNMENT_MAX_SCORE);
        assignment1.setScoreObtained(score);
    }

    public EvaluationItem getAssignment2() {
        return assignment2;
    }

    public void setAssignment2(double score) {
        assignment2.setName("Assignment 2");
        assignment2.setMaxScore(ASSIGNMENT_MAX_SCORE);
        assignment2.setScoreObtained(score);
    }

    public EvaluationItem getLassignment3() {
        return assignment3;
    }

    public void setAssignment3(double score) {
        assignment3.setName("Assignment 3");
        assignment3.setMaxScore(ASSIGNMENT_MAX_SCORE);
        assignment3.setScoreObtained(score);
    }

    public EvaluationItem getAssignment4() {
        return assignment4;
    }

    public void setAssignment4(double score) {
        assignment4.setName("Assignment 4");
        assignment4.setMaxScore(ASSIGNMENT_MAX_SCORE);
        assignment4.setScoreObtained(score);
    }

    public EvaluationItem getExam1() {
        return exam1;
    }

    public void setExam1(double score) {
        exam1.setName("Exam 1");
        exam1.setMaxScore(ASSIGNMENT_MAX_SCORE);
        exam1.setScoreObtained(score);
    }

    public EvaluationItem getExam2() {
        return exam2;
    }

    public void setExam2(double score) {
        exam2.setName("Exam 2");
        exam2.setMaxScore(ASSIGNMENT_MAX_SCORE);
        exam2.setScoreObtained(score);
    }


    public double calculateTotalAssignmentScore() {
        double scoreTotal = assignment1.getScoreObtained() + assignment2.getScoreObtained() + assignment3.getScoreObtained() + assignment4.getScoreObtained();
        return scoreTotal;
    }

    public double calculateAssignmentScorePercentage() {
        double scoreTotal = calculateTotalAssignmentScore();
        double totalMaxScore = assignment1.getMaxScore() +
                assignment2.getMaxScore() +
                assignment3.getMaxScore() +
                assignment4.getMaxScore();

        return (scoreTotal*100) / totalMaxScore;
    }


    public String displauReportCard() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", lab1=" + lab1 +
                ", lab2=" + lab2 +
                ", lab3=" + lab3 +
                ", lab4=" + lab4 +
                ", lab5=" + lab5 +
                ", assignment1=" + assignment1 +
                ", assignment2=" + assignment2 +
                ", assignment3=" + assignment3 +
                ", assignment4=" + assignment4 +
                ", exam1=" + exam1 +
                ", exam2=" + exam2 +
                '}' + "\n\n\n\n this is from report card" + calculateTotalAssignmentScore();
    }
}
