class Solution {
    public int minCapability(int[] nums, int k) {
        int n = nums.length; 
        int low = Integer.MAX_VALUE; 
        int high = Integer.MIN_VALUE; 
        for(int num : nums) {
            low = Math.min(low, num); 
            high = Math.max(high, num); 
             
        }


     while(low < high) {
        int mid = low + (high-low)/2; 
        if(canPick(nums, k, mid)) {
            high = mid; 
        } else {
            low = mid+1; 
        }
     }  
     return low; 
    }
    private boolean canPick(int[] nums,  int k , int mid) {
        int count = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= mid) {
                count++;
                i++; 

            }
        }
        return count >= k; 
    }

}