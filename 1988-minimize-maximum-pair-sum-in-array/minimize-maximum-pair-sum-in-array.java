class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums); 
        int left = 0; 
        int right = n-1; 
        int maxSum = 0; 
        while(left < right) {
            int sum = nums[left] + nums[right]; 
            maxSum = Math.max(maxSum, sum); 
            
            left++; 
            right--; 
            

        } 
        return maxSum; 
    }
}