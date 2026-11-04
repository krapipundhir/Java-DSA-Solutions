/**
 * PrintSumToN.java
 *
 * Author: Krapi Pundhir
 * Date: October 1, 2026
 *
 * Description:
 * Demonstrates recursion in Java by calculating
 * the sum of the first n natural numbers.
 *
 * Key Concepts:
 * - Recursive method implementation
 * - Base case handling
 * - Summation of natural numbers
 *
 * Usage:
 *   Input: n = 5
 *   Output: Sum of first 5 natural numbers is: 15
 */

public class PrintSumToN {

    public int printSumToN(int n){
        if(n==0){
            return 0;
        }
        return n + printSumToN(n - 1);
    }
    public static void main(String argsp[]){
        int n = 5;
        PrintSumToN obj = new PrintSumToN();
        int sum = obj.printSumToN(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

