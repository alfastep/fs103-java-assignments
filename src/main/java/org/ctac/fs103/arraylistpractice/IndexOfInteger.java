package org.ctac.fs103.arraylistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number or enter 0 to stop.");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Done entering integers into list.");
                break;
            } else {
                list.add(num);
            }
        }

        System.out.println("What number are you looking for in the list?");

        int numToFind = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if(numToFind == list.get(i)) {
                System.out.println(numToFind + " is at index " + i);
            }
        }

    }
}
