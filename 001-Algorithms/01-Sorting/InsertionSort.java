import java.util.*;
/**
 * InsertionSort.java
 *
 * Implements the Insertion Sort algorithm to arrange
 * an integer array in ascending order. Demonstrates
 * element shifting and placement of the current key
 * into its correct position. Prints the sorted array
 * after execution.
 */

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        // Insertion Sort Algorithm.
        for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                // Keeep Swapping .
                // Keep shifting the elements to the right until we find the correct position for current
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        insertionSort(arr);
    }    
}