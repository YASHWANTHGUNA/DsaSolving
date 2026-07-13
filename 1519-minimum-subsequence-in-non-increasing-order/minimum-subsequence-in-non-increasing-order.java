class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int n = nums.length; 
        int sum = 0; 
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>(); 
       
        int currSum = 0; 
        for(int i = n-1; i >= 0; i--) {
            currSum += nums[i]; 
            result.add(nums[i]);
            int remSum = sum - currSum;  
            if(currSum > remSum) {
                return result; 
            }
            
        }
        return result; 
        
    }
}