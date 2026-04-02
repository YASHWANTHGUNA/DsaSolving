class Solution {
    public long rob(int[] nums, int[] colors) {
        int n = nums.length;

        if(n == 1) return nums[0];

        long[] dp = new long[n];

        dp[0] = nums[0];

       
        if(colors[1] != colors[0]) {
            dp[1] = (long)nums[0] + nums[1];
        } else {
            dp[1] = Math.max(nums[0], nums[1]);
        }

        for(int i = 2; i < n; i++) {

            long take;
            if(colors[i] != colors[i-1]) {
                take = dp[i-1] + nums[i];
            } else {
                take = dp[i-2] + nums[i];
            }

            long skip = dp[i-1];

            dp[i] = Math.max(take, skip);  
        }

        return dp[n-1];
    }
}