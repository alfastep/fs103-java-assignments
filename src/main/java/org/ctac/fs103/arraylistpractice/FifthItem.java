package org.ctac.fs103.arraylistpractice;

import java.util.ArrayList;

import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            System.out.println("Enter a string or press enter to stop.");
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            } else {
                list.add(word);
            }
        }

        if (list.size() < 5) {
            System.out.println("The length of the list is less than 5");
        } else {
            System.out.println("The fifth item in the list is: " + list.get(4));
        }

    }
}
