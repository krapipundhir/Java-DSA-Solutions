/*
 * Program: Subsequenc:

 ** Overview:
 *   Generates all subsequences of a given string using recursion.
 *   Each character can either be included or excluded, leading to
 *   2^n possible subsequences for a string of length n.
 * 
 
 * Approach:
 *   - At each index, make two recursive calls:
 *       1. Exclude the current character.
 *       2. Include the current character.
 *   - Base case: when index reaches string length, print newString.
 * 
 *
 * Complexity:
 *   Time  : O(2^n) → Each character has two choices (include/exclude).
 *   Space : O(n)   → Recursive stack depth equals string length.
 *
 * Educational Use:
 *   Demonstrates recursion, branching decisions, and the power
 *   of exponential growth in combinatorial problems.
 */

public class Subsequence {
    public static void subsequencesOfaString(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currrentChar = str.charAt(index);

        subsequencesOfaString(str, index+1, newString ); // Exclude current character
        subsequencesOfaString(str, index+1, newString + currrentChar); // Include current character


    }
    public static void main(String [] args){
        String str = "abc";
        subsequencesOfaString(str, 0, "");
    }

}
