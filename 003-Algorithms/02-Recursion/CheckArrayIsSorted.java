/**
 * Program Purpose: Recursively check if an integer array 
 * is sorted in strictly ascending order.
 *
 * Example:
 * Input: {5, 10, 15, 20, 25}
 * Output: true
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), where n is the length of the array 
 *   (each element is compared once).
 * - Space Complexity: O(n), due to recursive call stack depth.
 *
 * Note: The function compares each element with its next neighbor 
 * and stops immediately if a descending pair is found.
 */

public class CheckArrayIsSorted {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length - 1){
            return true;
        }
        if(arr[idx] < arr[idx + 1]){
          return isSorted(arr, idx + 1);  
        }
        return false;
        
    }
    public static void main(String [] args){
        int arr[] = {5, 10, 15, 20, 25};
        System.out.println(isSorted(arr, 0));
    }
}
