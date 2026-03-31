class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length; 
        int maxLen  = 1; 
        for(int left = 0; left < n; left++) {
            int currentLen = 1; 
            for(int  right = left+1; right < n; right++) {
                if(nums[right] > nums[right-1] ) {
                    currentLen++;
                    maxLen = Math.max(maxLen, currentLen); 
                } else {
                    break;
                }
            }
        }
        return maxLen; 
    }
}