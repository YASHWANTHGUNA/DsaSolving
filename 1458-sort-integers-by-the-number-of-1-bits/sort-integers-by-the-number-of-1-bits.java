import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert int[] to Integer[] for custom sorting
        Integer[] boxed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxed[i] = arr[i];
        }

        // Sort using custom comparator
        Arrays.sort(boxed, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);
            
            // First sort by number of 1s
            if (bitsA != bitsB) {
                return bitsA - bitsB;
            }
            // If same number of 1s, sort by value
            return a - b;
        });

        // Convert back to int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxed[i];
        }

        return arr;
    }
}