class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length; 
        if(n==0) {
            return nums[0]; 
        }
        int maxEnding = nums[0]; 
        int minEnding = nums[0];
        int globalMax = nums[0]; 
        for(int i = 1; i < n; i++) {
            int tempMax = Math.max(nums[i],  Math.max( nums[i] * maxEnding, nums[i]*minEnding)); 
            int tempMin = Math.min(nums[i], Math.min( nums[i] * maxEnding, nums[i] * minEnding)); 
            maxEnding = tempMax; 
            minEnding = tempMin; 
            globalMax = Math.max(globalMax,  maxEnding); 
        }
        return globalMax; 
    }
}