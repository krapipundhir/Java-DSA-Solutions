/**
 * Program: KeyPadCombination
 * Author: Krapi Pundhir
 * Date: October 10, 2026
 *
 * Purpose:
 * Generate all possible letter combinations for a given numeric string
 * using mobile keypad mappings. Implements recursion with backtracking
 * for efficiency.
 *
 * Example:
 * Input: "23"
 * Output: ad ae af bd be bf cd ce cf
 *
 * Complexity:
 * Time: O(k^n) where n = length of input string, k = average mapping size
 * Space: O(n) recursion depth (excluding output storage)
 *
 **/

import java.util.Arrays;
public class KeyPadCombination{

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};
    public static void printKeypadCombination(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            printKeypadCombination(str, idx+1, combination + mapping.charAt(i));
        }
        

    }
    
    public static void main(String[] args) {
        String str = "23";
        printKeypadCombination(str, 0, "");
    }
}