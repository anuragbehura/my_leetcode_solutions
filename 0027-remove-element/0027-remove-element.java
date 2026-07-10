/*
 * Problem : Remove Element
 * URL     : https://leetcode.com/problems/remove-element/
 * Language: Java
 * Pushed  : 2026-07-10
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        // int k = nums.length; // k = current logical size of array
        // int i = 0;

        // while (i < k) {
        //     if (nums[i] == val) {
                // shift everything after i one step left
                // for (int j = i; j < k -1; j++) {
                //     nums[j] = nums[j + 1];
                // }
                // k--; // logical size shrinks by 1
                // don't increment i -- the shifted element needs to checked
        //     } else {
        //         i++;
        //     }
        // }
        // return k;


        // ----------optimized solution---------
        int n = nums.length;
        int k = 0; // left/right
        for (int i =0; i < n; i++) {
            if(nums[i] != val) {    // keep this element
                nums[k] = nums[i];
                k++;
            }
            // if nums[i] == val, skip it - k stays put
        }

        return k;
    }
}