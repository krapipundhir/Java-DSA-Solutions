/*
 * Program: RemoveDuplicate

 * Overview:
 *   Removes duplicate characters from a string using recursion.
 *   Preserves the order of first occurrences and skips repeats.
 *
 * Example:
 *   Input  : "aabccdeff"
 *   Output : "abcdef"
 *
 * Approach:
 *   - Maintain a boolean map of size 26 to track visited characters.
 *   - Recursively traverse the string, appending only unseen characters.
 *
 * Complexity:
 *   Time  : O(n)  → Each character is processed once.
 *   Space : O(n)  → Recursive stack + new string building.
 *
 * Learning Outcome:
 *   Demonstrates recursion, character mapping, and efficient 
 *   duplicate elimination in strings — a common DSA interview problem.
 */

public class RemoveDuplicate {
    public static boolean [] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){

        if(idx == str.length() ){
            System.out.println(newString);
            return; 
        }

        char currentChar = str.charAt(idx);
        if(map[currentChar-'a'] == true){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString += currentChar;
            map[currentChar-'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        String str = "aabccdeff";
        removeDuplicates(str, 0, "");
    }
}
