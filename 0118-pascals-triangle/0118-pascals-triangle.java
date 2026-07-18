/*
 * Problem : Pascal's Triangle
 * URL     : https://leetcode.com/problems/pascals-triangle/
 * Language: Java
 * Pushed  : 2026-07-18
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // i'll build the tringle row by row. for each new row, i know it has one more element than the previous row, starts and ends with 1, and every interior element at position j is preRow[j-1] + prevRow[j]. I iterate from index 1 to index rowSize - 2 for interior elements. Add each completed row to the result.
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // first element always 1
            row.add(1);

            // interior elements - sum of two parents from previous row
            // row i has i+1 elements, interior is index 1 to i-1
            if (i > 0) {
                List<Integer> prev = result.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }

                // last element always 1 (only add if row has more than 1 element)
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}