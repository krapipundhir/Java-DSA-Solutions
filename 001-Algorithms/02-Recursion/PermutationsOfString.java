/**
 * Program Purpose: Generate and print all permutations of a given string using recursion.
 *
 * Example:
 * Input: "abc"
 * Output: 
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 *
 * Complexity Analysis:
 * - Time Complexity: O(n * n!), where n is the length of the string 
 *   (n! permutations, each taking O(n) time to build/print).
 * - Space Complexity: O(n), due to recursive call stack depth.
 *
 * Note: Demonstrates recursion by fixing one character at a time and 
 *       permuting the remaining substring.
 */

public class PermutationsOfString {
    public static void printPermutations(String str, String Permutation){
        if(str.length()==0){
            System.out.println(Permutation);
        }
        for( int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, Permutation + currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
