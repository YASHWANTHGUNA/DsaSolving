class Solution {

    public long maximumProduct(int[] nums, int m) {

        int n = nums.length;

        long bestProduct = Long.MIN_VALUE;

        int maxPrefix = Integer.MIN_VALUE;
        int minPrefix = Integer.MAX_VALUE;

        for(int j = m - 1; j < n; j++) {

            int eligibleIndex = j - m + 1;

            maxPrefix = Math.max(maxPrefix, nums[eligibleIndex]);
            minPrefix = Math.min(minPrefix, nums[eligibleIndex]);

            long maxProduct = 1L * nums[j] * maxPrefix;
            long minProduct = 1L * nums[j] * minPrefix;

            bestProduct = Math.max(
                bestProduct,
                Math.max(maxProduct, minProduct)
            );
        }

        return bestProduct;
    }
}