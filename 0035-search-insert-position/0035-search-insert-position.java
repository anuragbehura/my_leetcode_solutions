/*
 * Problem : Search Insert Position
 * URL     : https://leetcode.com/problems/search-insert-position/
 * Language: Java
 * Pushed  : 2026-07-13
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        //--------brute force approach---------
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] >= target){
        //         return i;
        //     }
        // }
        // return nums.length;

        // this brute force is acceptable but the question explicitly asks for O(log n), so we need Binary Search

        // -----------optimized solution----------

        int low = 0;
        int high = nums.length -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return low;

    }
}