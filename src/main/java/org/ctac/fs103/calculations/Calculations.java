package org.ctac.fs103.calculations;

import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter another number: ");

        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((float)num1 / (float)num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
