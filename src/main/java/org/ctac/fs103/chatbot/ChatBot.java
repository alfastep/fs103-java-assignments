package org.ctac.fs103.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greeting();
        whatIsYourName();

        System.out.println("Your age is " + numberGuesser());

        System.out.println("What number would you like me to count to?");

        int number = Integer.parseInt(scanner.nextLine());

        counter(number);

        quiz();
    }

    public static void greeting() {
        System.out.println("Hello there!");
    }

    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        scanner.nextLine();

        System.out.println("Can you repeat your name please?");

        scanner.nextLine();

    }

    public static int numberGuesser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you know what a floppy disk is?");
        String ans1 = scanner.nextLine();

        System.out.println("Do you remember Sprite Remix Aruba Jam?");
        String ans2 = scanner.nextLine();

        System.out.println("Have you watched the show As Told By Ginger?");
        String ans3 = scanner.nextLine();

        System.out.println("Do you have an aol email account?");
        String ans4 = scanner.nextLine();

        if(ans1.equalsIgnoreCase("yes") && ans2.equalsIgnoreCase("yes")) {
            return 32;
        } else if (ans3.equalsIgnoreCase("no") && ans4.equalsIgnoreCase("no")) {
            return 18;
        } else {
            return 54;
        }
    }

    public static void counter(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void quiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which data type stores a decimal? ");
        System.out.println("a) String");
        System.out.println("b) boolean");
        System.out.println("c) float");
        System.out.println("d) integer");
        while (true) {
            if (scanner.nextLine().equalsIgnoreCase("c")){
                System.out.println("That is the correct answer.");
                break;
            } else {
                System.out.println("That is incorrect. Please try again.");
            }

        }
    }
}
