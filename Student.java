package net.codtech;

import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int numSubjects) {
        this.name = name;
        marks = new int[numSubjects];
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public int[] getMarks() {
        return marks;
    }
}

