/**
 * Program Purpose: Recursively print a given string in reverse order.
 *
 * Example:
 * Input: "hello"
 * Output: "olleh"
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), where n is the length of the string (each character is processed once).
 * - Space Complexity: O(n), due to recursive call stack depth.
 *
 * Note: Demonstrates recursion by reducing the index step-by-step until the base case (index == 0).
 */

public class StringRev {
    public static void printReverse(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
    
        printReverse(str, index-1);
    }
    public static void main(String [] args){
        String str = "hello";
        printReverse(str, str.length()-1);
    }
    
}
