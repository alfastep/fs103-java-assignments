package org.ctac.fs103.scanner;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");

        String str = scanner.nextLine();

        System.out.println("Enter an integer: ");

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a double: ");

        double dec = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter a boolean value: ");

        boolean bool = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Your string is " + str);

        System.out.println("Your integer is " + num);

        System.out.println("Your double is " + dec);

        System.out.println("Your boolean is " + bool);
    }
}
