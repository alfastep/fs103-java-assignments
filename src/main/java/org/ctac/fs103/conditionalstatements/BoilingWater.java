package org.ctac.fs103.conditionalstatements;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212: ");

        boiling(Integer.parseInt(scanner.nextLine()));

    }

    public static String boiling(int a) {
        if (a >= 212) {
            return "Water is boiling!";
        }

        return "Water is not boiling!";
    }
}
