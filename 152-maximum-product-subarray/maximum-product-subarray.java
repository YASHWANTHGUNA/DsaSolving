class Solution {
    public int maxProduct(int[] nums) {
        int n  = nums.length; 
        if(n==1) {
            return nums[0]; 
        }
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0]; 
        int globalMax = nums[0]; 
        for(int i = 1; i < n; i++) {
            int tempMax = Math.max(nums[i], Math.max(nums[i] * maxEndingHere, nums[i]*minEndingHere)); 
            int tempMin = Math.min(nums[i], Math.min(nums[i] * maxEndingHere, nums[i] * minEndingHere));
            maxEndingHere = tempMax; 
            minEndingHere = tempMin; 
            globalMax = Math.max(globalMax, maxEndingHere); 
        }
        return globalMax; 
        
    }
}