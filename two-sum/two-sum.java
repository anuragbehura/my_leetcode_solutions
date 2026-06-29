/*
 * Problem : Two Sum
 * URL     : https://leetcode.com/problems/two-sum/
 * Language: Java
 * Pushed  : 2026-06-29
 */
        // 1. This is brute force approach
        // The simplest approach for every element at index(i), 
        // I check every other element at index(j) to see if they sum to target.
        // two nested loops: if [nums[i] + nums[j] == target];
        // I return [i, j]

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
    public int[] twoSum(int[] nums, int target) {
class Solution {
