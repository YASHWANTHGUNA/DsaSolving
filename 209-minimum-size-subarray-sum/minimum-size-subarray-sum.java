class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length; 
        int sum = 0; 
        int minLen = Integer.MAX_VALUE; 
        int left = 0, right = 0;
        while(right < n) {
            sum += nums[right]; 
            while(sum >= target) {
                minLen = Math.min(minLen, right-left+1); 
                sum -= nums[left];
                left++;  

            }
            right++; 
            
        }
        if(minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen; 

        
    }
}