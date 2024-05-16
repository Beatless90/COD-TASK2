package net.codtech;

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        Student student = new Student(studentName, numSubjects);
        student.inputMarks();

        int[] marks = student.getMarks();
        float total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float percentage = total / numSubjects;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
