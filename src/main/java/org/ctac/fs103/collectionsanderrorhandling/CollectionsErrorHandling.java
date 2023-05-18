package org.ctac.fs103.collectionsanderrorhandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsErrorHandling {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(5);
        numbers.add(8);

        try {
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);
            System.out.println("List of Integers without duplicates: " + uniqueNumbers);

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum: " + sum);

            double average = (double) sum / numbers.size();
            System.out.println("Average: " + average);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
