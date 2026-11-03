/**
 * PrintPower.java
 *
 * Author: Krapi Pundhir
 * Date: October 5, 2026
 *
 * Description:
 * Demonstrates recursion in Java by computing x^n.
 * The method `returnPower` handles base cases:
 *   - If exponent n = 0, returns 1.
 *   - If base x = 0, returns 0.
 * Otherwise, recursively multiplies x until n reduces to 0.
 *
 * Example:
 * Input: x = 2, n = 3
 * Output: 8
 *
 * Key Concepts:
 * - Recursive function calls
 * - Base case handling
 * - Exponentiation logic
 */

public class PrintPower {
    public static int returnPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x * returnPower(x, n - 1);
    }
    public static void main(String[] args){
        int x = 2;
        int n = 3;
        System.out.println(returnPower(x, n));
    }
}
