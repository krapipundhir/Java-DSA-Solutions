/*
 * Program: Permutation of a String Using Backtracking
 * Language: Java
 * * Description:
 * This program generates and displays all possible permutations
 * of a given string using the Backtracking technique. At each
 * recursive call, one character is selected, added to the
 * current answer string, and removed from the remaining string.
 * The process continues until all characters have been used,
 * producing a complete permutation.
 *
 * Example:
 * Input  : "ABC"
 * Output : ABC, ACB, BAC, BCA, CAB, CBA
 *
 * Concepts Used:
 * - Backtracking
 * - Recursion
 * - String Manipulation
 *
 * Author: Krapi
 * Date: 24 October 2026
 */

public class PermutationStri {

    public static void permutationOfAString(String str, String ans){
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }   

        for(int i=0; i<str.length(); i++ ){
            char currentChar =  str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            permutationOfAString(newString, ans + currentChar );
        }

    }
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of the string \"" + str + "\":");
        permutationOfAString(str, "" );
        
    }
}
