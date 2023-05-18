package org.ctac.fs103.practicingloops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 0) {
                System.out.println("Number must be a positive number");
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Number is " + num);
            }
        }
    }
}
