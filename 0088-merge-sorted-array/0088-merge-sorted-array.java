/*
 * Problem : Merge Sorted Array
 * URL     : https://leetcode.com/problems/merge-sorted-array/
 * Language: Java
 * Pushed  : 2026-07-15
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // -----------Brute force----------
        // Brute force -copy then sort
        // O((m+n) log(m+n)) time , O(1) space
        // copy nums2 into the tail of num1
        // for (int i = 0; i < n; i++) {
        //     nums1[m + i] = nums2[i];
        // }
        // sort the whole thing
        // Arrays.sort(nums1);

        // -----------Opimized Solution--------

        int i = m-1; // pointer for nums1 real elements(right to left)
        int j = n-1; // pointer for nums2 (right to left)
        int k = m + n -1; // write position in nums1 (right to left)

        // merge from the back -- largest elements placed first
        while(i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--]; // nums1's element is larger
            } else {
                nums1[k--] = nums2[j--]; // nums2's element is larger
            }
        }
        // if nums2 still has elements, copy them in
        // (they're smaller than everything already placed)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // if num1 still has elements - nothing to do
        // they're already in the correct position in nums1
    }
}