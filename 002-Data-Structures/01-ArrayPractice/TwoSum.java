import java.util.Arrays;

// import java.util.*;
/**
 * Problem Name : 1. Two Sum
 * Language : Java
 * Platform : LeetCode / VS Code (Local Execution)
 * Algorithm : Brute Force Approach (Nested Loops)
 * Time Complexity : O(n^2) - Checking every possible pair
 * Space Complexity: O(1) - Using constant extra space
 * 
 * Description:
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */
public class TwoSum {

    public int[] twoSum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        TwoSum obj = new TwoSum();
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int result[] = obj.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Result Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }

        /*
         * Option 2: Taking Dynamic Input using Scanner
         * 
         * Scanner sc=new Scanner(System.in);
         * int size=sc.nextInt();
         * int nums[]=new in[size];
         * 
         * for(int i=0;i<size;i++){
         * nums[i]=sc.nextInt();
         * }
         * 
         * int target=sc.nextInt();
         * int result=obj.twoSum(nums,target);
         * 
         * // System.out.println("Index of the two numbers are: "+
         * Arrays.toString(result));
         * 
         * if(result.length==2){
         * System.out.println("Result Indices: "+Arrays.toString(result));
         * } else {
         * System.out.println("No two numbers found that add up to the target.");
         * }
         * sc.close();
         */

    }

}
