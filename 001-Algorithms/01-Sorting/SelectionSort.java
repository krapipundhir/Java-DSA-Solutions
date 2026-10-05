/**
 * SelectionSort.java
 *
 * Simple implementation of Selection Sort.
 * Finds the smallest element in the unsorted
 * part of the array and swaps it into place.
 * Prints the array after sorting.
 *
 * Time Complexity: O(n^2)

This code implements the Selection Sort algorithm, 
which sorts an array by repeatedly finding the minimum element from the unsorted part 
and moving it to the beginning. The time complexity of this algorithm is O(n^2), making it inefficient on large lists, and
generally performs worse than the similar insertion sort. However, it has the advantage of being simple to understand and implement.
 */

import java.util.*;
public class SelectionSort {
    public static void printSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        
        int arr[]={ 5, 1, 4, 2, 8 };
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printSortedArray(arr);
    }
}