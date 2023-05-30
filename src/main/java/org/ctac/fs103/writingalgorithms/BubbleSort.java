package org.ctac.fs103.writingalgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr, int n) {
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                int tempJ = arr[j];
                int tempJNext = arr[j+1];
                if (arr[j] > arr[j+1]) {
                    arr[j] = tempJNext;
                    arr[j+1] = tempJ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        bubblesort(arr, n);

        System.out.println(Arrays.toString(arr));
    }
}
