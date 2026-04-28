class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length; 
       
        if(n < 3) return 0; 
        
        int sum = 0; 
        int prev = 0; 
        for(int i = 2; i  < n; i++) {
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) {
               prev = prev + 1; 
               sum += prev; 
            } else {
                prev = 0; 
            }
            
        }
        return sum; 
        
    }
}