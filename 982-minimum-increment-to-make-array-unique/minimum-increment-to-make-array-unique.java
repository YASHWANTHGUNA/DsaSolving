class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length; 
        int cost =  0; 
        for(int i = 0; i < n-1; i++) {
            if(nums[i] > nums[i+1]) {
                Arrays.sort(nums);
            }
        }
        int prevFinal  = nums[0];
        for(int i = 1; i < n; i++) {
            
            if(nums[i] > prevFinal ) {
                
                prevFinal = nums[i]; 

            } else {
                prevFinal  += 1;
                 cost += prevFinal - nums[i];  
                
            }
           
        }
        return cost;
    }
}