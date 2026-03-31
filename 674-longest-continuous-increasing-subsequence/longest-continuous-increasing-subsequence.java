class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length; 
        int maxLen  = 1; 
        int currentLen  = 1; 
        for(int i = 1; i < n; i++) {
            if(nums[i] > nums[i-1]) {
               currentLen++; 
            } else {
                currentLen  =1; 
            }
            maxLen  =Math.max(maxLen, currentLen);
        }
        return maxLen; 
        
    }
}