/*
 * Program: UniquSubsequence
 * Author : [ Krapi Pundhir  ]
 * Date   : 10 October 2026
 *
 * Overview:
 *   Prints all unique subsequences of a given string using recursion.
 *   A HashSet is used to avoid duplicate subsequences when characters repeat.
 *
 * Example:
 *   Input  : "aaaa"
 *   Output : 
 *            "" 
 *            "a"
 *            "aa"
 *            "aaa"
 *            "aaaa"
 *
 * Approach:
 *   - At each index, two recursive calls are made:
 *       1. Exclude the current character.
 *       2. Include the current character.
 *   - Base case: when index reaches string length, check if subsequence
 *     is already in HashSet. If not, print and add it.
 *
 * Complexity:
 *   Time  : O(2^n) → Each character has two choices (include/exclude).
 *   Space : O(2^n) → HashSet stores all unique subsequences.
 *
 * Educational Use:
 *   Demonstrates recursion, branching decisions, and the use of
 *   HashSet to eliminate duplicates in combinatorial problems.
 */

import java.util.HashSet;
public class UniquSubsequence {
     public static void printOnlyUninqueSbsequences(String str, int index, String newString, HashSet<String> newSet){
        if(index==str.length()){

            if(newSet.contains(newString)){
                return;
            }

            else{
                System.out.println(newString);
                newSet.add(newString);
                return;
            }
        }
        
        char currrentChar = str.charAt(index);

        printOnlyUninqueSbsequences(str, index+1, newString, newSet ); // Exclude current character
        printOnlyUninqueSbsequences(str, index+1, newString + currrentChar, newSet); // Include current character


    }
    public static void main(String [] args){
        String str = "aaaa";
        HashSet<String> newSet =  new HashSet<>();
        printOnlyUninqueSbsequences(str, 0, "", newSet);
    }

}


