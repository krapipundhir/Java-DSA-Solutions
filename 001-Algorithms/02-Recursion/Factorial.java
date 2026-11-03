/**
 * Factorial.java
 *
 * Program Purpose:
 *   Calculates the factorial of a number using recursion
 *   and prints the result for a given input.
 *
 *  Example:
 *
 *   Input: n = 5
 *   Output: 5! = 120
 *
 *  Complexity Analysis:
 *   • Time Complexity: O(n)
 *     (One recursive call per decrement until n reaches 0.)
 *   • Space Complexity: O(n)
 *     (Recursion stack grows linearly with n.)
 *
 * Note:
 *   Demonstrates recursion with a simple mathematical problem,
 *   useful for understanding base case and recursive case logic.
 */

public class Factorial {
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String args[]){
        int n =5;
        Factorial s = new Factorial();
        int res =s.factorial(n);
        System.out.println("Factorial of " + n + " is: " + res);
    }
}
