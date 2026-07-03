/*
 * Problem : Remove Duplicates from Sorted Array
 * URL     : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Language: Java
 * Pushed  : 2026-07-03
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        // ------------Brute Force----------
        // collect uniques - TreeSet keeps sorted order
        // Set<Integer> seen = new TreeSet<>();
        // for(int num : nums) {
        //     seen.add(num);
        // }

        // write back into original array
        // int k = 0;
        // for (int num : seen) {
        //     nums[k++] = num;
        // }
        // return k;

        // ------------Optimized Solution----------
        // k = position where next unique element will be written 
        // starts at 1 because index 0 is always uinque
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            // found a new unique element - it differ from the one before it
            // (safe because array is sorted, so duplicates are adjacent)
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // write it at the next available position
                k++; // advance the writer pointer
            }
            // if nums[i] == nums[i-1], it's a duplicate 
            // just skip it
        }
        return k;
    }
}
