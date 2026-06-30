/*
 * Problem : Longest Common Prefix
 * URL     : https://leetcode.com/problems/longest-common-prefix/
 * Language: Java
 * Pushed  : 2026-06-30
 */


            for(int i = 1; i < strs.length; i++) {
                // mismatch happens if this string is 
                too short,
                // OR the charecter at this position 
                differs
                if (charIndex == strs[i].length() || 
                strs[i].charAt(charIndex) != c) {
                    return strs[0].substring(0, 
                    charIndex);
                }
            }
        }

        return strs[0]; // first string itself is 
        common prefix
    }
}