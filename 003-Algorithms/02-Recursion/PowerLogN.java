/**
 * PowerLogN.java
 *
 * Author: Krapi Pundhir
 * Date: October 5, 2026
 *
 * Description:
 * Implements fast exponentiation (x^n) using recursion
 * with logarithmic time complexity. The algorithm applies
 * divide-and-conquer:
 *   - Base cases: n == 0 returns 1, x == 0 returns 0.
 *   - If n is even: compute power(x, n/2) once and square it.
 *   - If n is odd: multiply x with squared result of power(x, n/2).
 *
 * Key Concepts:
 * - Recursion
 * - Divide-and-conquer strategy
 * - Optimized power calculation in O(log n) time
 *
 * Usage Example:
 *   Input: x = 2, n = 7
 *   Output: 128
 *
 * Note:
 * This program demonstrates efficient recursive exponentiation
 * for academic learning and practice in Data Structures & Algorithms.
 */
public class PowerLogN {
    public static int raisedPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return raisedPower(x,n/2) * raisedPower(x,n/2);
        }else{
            return x * raisedPower(x,n/2) * raisedPower(x,n/2);
        }

    }
    public static void main(String[] args){
        int x =2;
        int n = 7;
        System.out.println(raisedPower(x, n));
    }
}
