/**
 * Program Purpose: Recursively check if an integer array 
 * is sorted in ascending order.
 *
 * Example:
 * Input: {6, 7, 8, 9, 10}
 * Output: true
 *
 * Algorithm:
 * - Base Case: If the current index reaches the last element, 
 *   return true (array is sorted).
 * - Recursive Case: Compare arr[idx] with arr[idx+1].
 *   If arr[idx] > arr[idx+1], return false immediately.
 *   Otherwise, continue recursion with the next index.
 *
 * Complexity:
 * - Time Complexity: O(n), where n is the length of the array.
 * - Space Complexity: O(n), due to recursive call stack depth.
 */


public class SortedArray {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String [] args){
        int arr[] = {6,7,8,9,10};
        System.out.println(isSorted(arr, 0));

    }
}
