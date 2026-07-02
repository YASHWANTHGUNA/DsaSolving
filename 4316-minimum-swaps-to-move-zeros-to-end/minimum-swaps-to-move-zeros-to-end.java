class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length; 
        int zeroes = 0; 
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                zeroes++; 
            }
        }
        int moves = 0; 
        for(int i = n-zeroes; i < n; i++) {
            if(nums[i] != 0) {
                moves++;
            }
        }
        return moves; 
        
    }
}