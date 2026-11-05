/*
 * Program: MoveAllXInLast
 * Author : [Krapi Pundhir]
 *
 * Description:
 *   Recursively processes a string to move all occurrences of 
 *   the character 'x' to the end while preserving the order 
 *   of other characters.
 *
 * Example:
 *   Input  : "axbcxxd"
 *   Output : "abcdxxx"
 *
 * Key Points:
 *   - Uses recursion for character traversal.
 *   - Counts 'x' occurrences and appends them at the end.
 *
 * Complexity:
 *   Time  : O(n)  → Each character is visited once.
 *   Space : O(n)  → Recursive stack + new string building.
 *
 * Educational Use:
 *   Demonstrates recursion, string manipulation, and 
 *   deferred placement of specific characters.
 */

public class MoveAllXInLast {
    public static void moveAllXInLast(String str, int index, String newString, int count){
        if(index==str.length()){
            for(int i =0; i <=count; i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        Character ch = str.charAt(index);

        if(ch=='x'){
            count++;
            moveAllXInLast(str, index+1, newString, count);
        }
        else{
            newString +=  ch;
            moveAllXInLast(str, index+1, newString, count);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllXInLast(str, 0, "", 0);
    }
}
