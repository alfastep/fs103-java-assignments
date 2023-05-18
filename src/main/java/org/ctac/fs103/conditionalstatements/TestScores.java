package org.ctac.fs103.conditionalstatements;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100 ");

        int num = Integer.parseInt(scanner.nextLine());

        if (num >= 90) {
            System.out.println("Your grade is an A :)");
        } else if (num >= 80) {
            System.out.println("Your grade is a B");
        } else if (num >= 70) {
            System.out.println("Your grade is a C");
        } else if (num >= 60) {
            System.out.println("Your grade is a D");
        } else {
            System.out.println("Your grade is an F :(");
        }

    }
}
