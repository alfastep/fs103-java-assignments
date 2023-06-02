package org.ctac.fs103.conditionalstatements;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word1 = scanner.nextLine();

        System.out.println("Enter another word: ");

        String word2 = scanner.nextLine();

        if (match(word1, word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are not same");
        }
    }

    public static boolean match(String a, String b) {
        return a.equalsIgnoreCase(b);
    }
}
