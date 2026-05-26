class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        char[] arr = s.toCharArray();
        int n = arr.length;

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int len1 = expand(arr, i, i);

            // Even length palindrome
            int len2 = expand(arr, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private int expand(char[] arr, int left, int right) {
        while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
