package org.ctac.fs103.practicingloops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
