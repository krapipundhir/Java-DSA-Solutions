/**
* Description:
 * ------------
 * A Java program that prints numbers from 1 to N using Recursion.
 * Example: If N = 5, Output will be: 1 2 3 4 5
 * 
 * Concept Used: Recursion (Head / Standard Recursion)
 * Time Complexity: O(N)
 * Space Complexity: O(N) [Recursion Call Stack]
 */

public class PrintNSeries {
    public int printNNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        printNNumbers(n - 1);
        System.out.print(n + " ");
        return n;
    }
    public static void main(String[]args){
        int n =5;
        PrintNSeries obj = new PrintNSeries();
        obj.printNNumbers(n);
    }
}
