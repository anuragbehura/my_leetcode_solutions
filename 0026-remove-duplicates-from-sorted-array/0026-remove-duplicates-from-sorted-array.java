/*
 * Problem : Remove Duplicates from Sorted Array
 * URL     : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Language: Java
 * Pushed  : 2026-07-03
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        // collect uniques - TreeSet keeps sorted order
        Set<Integer> seen = new TreeSet<>();
        for(int num : nums) {
            seen.add(num);
        }

        // write back into original array
        int k = 0;
        for (int num : seen) {
            nums[k++] = num;
        }
        return k;
    }
}