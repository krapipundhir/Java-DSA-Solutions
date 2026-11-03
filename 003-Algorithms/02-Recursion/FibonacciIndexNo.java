/**
 * FibonacciIndexNo.java
 *
 * Purpose:
 *   Computes the nth Fibonacci number using a simple recursive approach.
 *
 *  Time Complexity: O(2^n)
 *   - Each call splits into two more calls (n-1 and n-2).
 *   - So the number of calls grows very fast (exponential).
 *
 * Space Complexity: O(n)
 *   - At most, the recursion stack goes as deep as 'n'.
 *   - Example: fibonacci(6) → stack depth up to 6.
 *
 * Note:
 *   This recursive approach is easy to understand,
 *   but not efficient for large 'n' because of repeated work.
 */


public class FibonacciIndexNo {
    public int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String args[]){
        int n= 6;
        FibonacciIndexNo obj = new FibonacciIndexNo();
        System.out.println("No. at the poition " +n+" is: "+ obj.fibonacci(n));
    }
}
