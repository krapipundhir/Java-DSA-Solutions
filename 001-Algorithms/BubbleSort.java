/**
 * BubbleSort.java
 *
 * Implements the Bubble Sort algorithm to arrange
 * an integer array in ascending order. Demonstrates
 * repeated pairwise comparisons and swapping of
 * adjacent elements until the array is sorted.
 * Prints the sorted array after execution.
 *
 * Time Complexity: O(n^2)
 */

import java.util.*;

public class BubbleSort {
    public static void printSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Time Complexity: O(n^2)
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printSortedArray(arr);
    }
}
