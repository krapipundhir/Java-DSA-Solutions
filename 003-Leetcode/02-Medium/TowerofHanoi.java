/**
 * Program: Tower of Hanoi (Recursion)
 * -----------------------------------
 * Purpose:
 *   Demonstrates the recursive solution to the classic Tower of Hanoi problem,
 *   where 'n' disks are moved from a source rod to a destination rod using a helper rod.
 * 
 * Example:
 *   Input: n = 3;  Source = A, Helper = B, Destination = C
 * 
 * Complexity Analysis:
 *   Time Complexity: O(2^n)  → Each disk move requires recursive calls.
 *   Space Complexity: O(n)   → Due to recursion stack depth.
 *
 * Note:
 *   Tower of Hanoi is a fundamental recursion problem that illustrates
 *   divide-and-conquer strategy and exponential growth in recursive calls.
 */
public class TowerofHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk " +n+ " from "+src+" to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " +n+ " from "+src+ " to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n = 3; 
        towerOfHanoi(n, "A", "B", "C");
    }
}
