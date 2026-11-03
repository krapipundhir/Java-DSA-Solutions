/**
 * FibonacciStnRec.java
 *
 * Program Purpose:
 *   Prints the Fibonacci sequence up to 'n' terms
 *   using simple recursion with parameters (a, b).
 *
 * Example:
 *   Input: n = 6
 *   Output: 0 1 1 2 3 5
 *
 * Complexity:
 *   • Time: O(n)  → one recursive call per term
 *   • Space: O(n) → recursion stack depth
 *
 * Note:
 *   This approach prints values directly instead of
 *   returning them, making it suitable for sequence display.
 */
public class FibonacciStnRec {
    public static void fibonacci( int a, int b,int n) {
        if(n==0) {
            return;
        }
        System.out.println(a+b);
        fibonacci(b, a + b, n - 1);
    }
    public static void main(String args[]){
        int n = 6;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibonacci(0, 1, n-2);
    }
}
