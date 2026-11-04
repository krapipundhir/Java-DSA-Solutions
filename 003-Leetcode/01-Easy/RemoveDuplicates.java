/* =========================================================================
 * LeetCode 26 - Remove Duplicates from Sorted Array
 * Topic      : Arrays, Two Pointers
 * Difficulty : Easy
 *
 * Brute Force Approach:
 * Store unique elements in another list.
 * Then copy them back into original array.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * =========================================================================
 */

import java.util.*;

class Solution {

    public int removeDuplicates(int[] nums) {

        List<Integer> unique = new ArrayList<>();

        unique.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                unique.add(nums[i]);
            }
        }

        for (int i = 0; i < unique.size(); i++) {
            nums[i] = unique.get(i);
        }

        return unique.size();
    }
}
