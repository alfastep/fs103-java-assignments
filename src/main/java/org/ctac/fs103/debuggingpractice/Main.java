package org.ctac.fs103.debuggingpractice;

import java.util.Arrays;

public class Main {
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty.");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double average = average(arr);

        System.out.println(average);
    }
}
