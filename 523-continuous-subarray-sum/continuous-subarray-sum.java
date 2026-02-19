class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length; 
        Map<Integer, Integer> remainders = new HashMap<>(); 
        remainders.put(0, -1); 
        int prefixSum = 0; 
        int remainder = 0; 
        for(int i = 0; i < n; i++) {
            prefixSum += nums[i]; 
            remainder = prefixSum % k; 
          
            if(remainders.containsKey(remainder)) { 
                int prevIndex =  remainders.get(remainder); 
                if(i - prevIndex >= 2) {
                    return true; 
                } 

            } else {
                remainders.put(remainder,i); 
            }
           

        }
        
        return false; 
        
    }
}