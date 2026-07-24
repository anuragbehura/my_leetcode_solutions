/*
 * Problem : Reverse Integer
 * URL     : https://leetcode.com/problems/reverse-integer/
 * Language: Java
 * Pushed  : 2026-07-24
 */
class Solution {
    public int reverse(int x) {
        // -----------Brute Force------------
        // String reversal
        // O(log x) time (number of digits), O(log x) space (the string)

        // handle sign
        // boolean negative = x < 0;
        // String str = String.valueOf(Math.abs(x));

        // reverse the string
        // String reversed = new StringBuilder(str).reverse().toString();

        // Parse back - but this can overflow long if not careful
        // actually reversed int digits can overflow long too for extreme cases
        // try {
        //     long result = Long.parseLong(reversed);
        //     if (negative) result = -result;

        //     // check 32- bit bounds
        //     if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        //         return 0;
        //     }
        //     return (int) result;
        // } catch (NumberFormatException e) {
        //     return 0;
        // }


        // --------Optimized Solution---------
        // math-based didgit extraction, long for overflow detection
        // O(log x) time, O(1) space

        long result = 0;

        while (x != 0) {
            int digit = x % 10; // extract last digit
            x /= 10;    // remove last digit
            result = result * 10 + digit;

            // early exit - if already out of range, no point continuing
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) result;
    }
}