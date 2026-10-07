/**
 * 
 * FibonacciSeries.java
 *
 * Purpose:
 *   Print the Fibonacci series up to the nth term using tail recursion.
 *
 * Example:
 *   Input: n = 5
 *   Output:= 0 1 1 2 3 5 
 *
 * Complexity:
 *   • Time: O(n)  → perform one recursive call per term.
 *   • Space: O(n) → call stack depth grows linearly with n in Java.
 *
 * Note:
 *   Tail recursion ensures the recursive call is the final operation,
 *   making the approach cleaner and easier to optimize.
 */

// Tail Recursion: Fibonacci Series Java
public class FibonacciSeries {
    public static int fibonacci(int a, int b, int n) {
        if(n==0){
            return a;
        }
        System.out.println(a + " ");
        return fibonacci(b, a + b, n - 1);
    }
    public static void main(String args[]){
        int n = 6;
        // FibonacciSeries obj = new FibonacciSeries();
        fibonacci(0, 1, n);
    }   
}
