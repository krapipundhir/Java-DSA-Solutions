/**
 * 
 * SubsetsFromSet
 * 
 * -----------------------------------------
 * Purpose: Generates all possible subsets of numbers from 1 to n.
 * -----------------------------------------
 * This program uses recursion to find and print 
 * all subsets of a given set {1, 2, ..., n}.
 * 
 * Logic:
 * 
 * 
 * - At each step, either exclude the current number 
 *   or include it in the subset.
 * - Recursively explore both choices until n reaches 0.
 * - Print the subset when base case is reached.
 * 
 * 
 * Base Case:
 * 
 * 
 * - n == 0 → Print the current subset.
 * 
 * Recursive Formula:
 * findSubsets(n, subset) = 
 *     findSubsets(n-1, subset)        // exclude current number
 *     + findSubsets(n-1, subset+[n])  // include current number
 * 
 * Example:
 * For n = 3 → Output subsets:
 * {}, {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}
 * -----------------------------------------
 * Author: Krapi
 * Date: October 2026
 * 
 */

import java.util.ArrayList;

public class SubsetsFromSet {

    // public static void printSubsets(ArrayList<Integer> subset) {

    //     for (int i = 0; i < subset.size(); i++) {
    //         System.out.print(subset.get(i) + " ");
    //     }
        
    //     System.out.println();
    // }

    public static void findSubsets(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            System.out.println(subset);
            return;
        }

        findSubsets(n - 1, subset);
        subset.add(n);
        findSubsets(n - 1, subset);
        subset.remove(subset.size() - 1);
    }

    public static void main(String args[]) {
        int n = 3;
        findSubsets(n, new ArrayList<Integer>());

    }
}
