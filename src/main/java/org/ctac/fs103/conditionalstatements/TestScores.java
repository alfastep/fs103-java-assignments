package org.ctac.fs103.conditionalstatements;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100 ");

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(grade(num));

    }

    public static String grade(int num) {
        if (num >= 90) {
            return "Your grade is an A :)";
        } else if (num >= 80) {
            return "Your grade is a B";
        } else if (num >= 70) {
            return "Your grade is a C";
        } else if (num >= 60) {
           return "Your grade is a D";
        } else {
            return "Your grade is an F :(";
        }
    }
}
