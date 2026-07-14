/*
 * Problem : Plus One
 * URL     : https://leetcode.com/problems/plus-one/
 * Language: Java
 * Pushed  : 2026-07-14
 */
class Solution {
    public int[] plusOne(int[] digits) {
        // ---------brute force-----------
        int n = digits.length;
        // int carry = 1; // the "plus one" we're adding

        // for(int i = n -1; i >= 0; i--) {
        //     int sum = digits[i] + carry;
            // digits[i] = sum % 10; // new digit value
            // carry = sum / 10;    // 0 if no carry, 1 if carry
            // if (carry == 0) return digits; // carry died, nothing left to do
        // }
        // carry is still 1 - all digits were 9
        // e.g. [9,9,9] -> needs to become [1,0,0,0]
        // int[] result = new int[n + 1];
        // result[0] = 1;  // rest are 0 by JAVA default
        // return result;


        // ----------optimized solution-----------
        // no carry variable, early retun the moment carry dies
        // O(n) worst case, O(1) practical for most inputs

        for (int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;  // no carry - done immediatly
                return digits;
            }
            digits[i] = 0;    // was 9, becomes 0, carry continues left
        }

        // every digit was 9 - need one extra digit at the front
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}