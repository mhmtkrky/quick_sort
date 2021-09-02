package com.quicksort;

import com.quicksort.main.Print;
import com.quicksort.main.QuickSort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 8, 5, 2, 1, 4, 6, 2, 6, 2, 9, 8, 18, 12, 41, 23, 15, 61, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, n - 1);

        System.out.println("sorted array");
        Print.printArray(arr);
    }
}
