package org.ctac.fs103.practicehandlingexceptions;

public class Calculator {
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The number should be non-negative");
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("The parameters must be non-negative and the subset size must not exceed the set size");
        }

        int numerator = factorial(n);
        int denominator = factorial(k) * factorial(n-k);

        return numerator/denominator;
    }

    public static void main(String[] args) {
        int result = Calculator.binomialCoefficient(5, 2);
        System.out.println(result);

        int result2 = Calculator.binomialCoefficient(4, 5);
    }
}
