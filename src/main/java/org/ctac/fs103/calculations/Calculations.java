package org.ctac.fs103.calculations;

import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter another number: ");

        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static float divide(int a, int b) {
        return (float)a / (float)b;
    }
}
