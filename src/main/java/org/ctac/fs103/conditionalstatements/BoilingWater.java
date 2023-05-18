package org.ctac.fs103.conditionalstatements;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212: ");

        if (Integer.parseInt(scanner.nextLine()) >= 212) {
            System.out.println("Water is boiling!");
        }

    }
}
