package org.ctac.fs103.objectsinlists;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animalList = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name:");
            String name = scanner.nextLine();

            if (name.equals("")) break;

            System.out.print("Is it a dog?");
            String isADog = scanner.nextLine();

            if (isADog.equals("")) break;

            if (isADog.equals("yes")) {
                animalList.add(new Animal(name, true));
            } else {
                animalList.add(new Animal(name, false));
            }
        }

        if (animalList.size() > 0) {
            for (Animal animal:animalList) {
                System.out.println(animal.toString());
            }
        } else {
            System.out.println("There are no animals in the list.");
        }
    }
}
