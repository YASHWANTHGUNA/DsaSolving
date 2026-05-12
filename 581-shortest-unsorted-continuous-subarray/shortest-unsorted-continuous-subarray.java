class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length; 
        int[] arr2 = Arrays.copyOf(nums, n); 
        int start = -1, end = -1; 
        Arrays.sort(arr2);
        for(int i = 0; i < n; i++) {
            if(nums[i] != arr2[i]) {
              if(start == -1) {
                start = i; 
              } 
              end = i; 
            }
           
        }
        if(start == -1) {
            return 0; 
        }
        return end-start+1; 
        
    }
}