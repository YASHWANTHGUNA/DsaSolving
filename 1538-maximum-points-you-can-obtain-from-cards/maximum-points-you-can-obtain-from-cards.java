class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
        }

        // Edge case
        if (k == n) {
            return totalSum;
        }

        int windowSize = n - k;

        // First window
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minSum = windowSum;

        int left = 0;
        int right = windowSize - 1;

        while (right < n - 1) {

            windowSum -= cardPoints[left];
            left++;

            right++;
            windowSum += cardPoints[right];

            minSum = Math.min(minSum, windowSum);
        }

        return totalSum - minSum;
    }
}