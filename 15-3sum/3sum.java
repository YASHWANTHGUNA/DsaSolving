import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort the array. This is the crucial first step.
        Arrays.sort(nums);
        
        
        List<List<Integer>> results = new ArrayList<>();
        
        int n = nums.length;

        
        for (int i = 0; i < n - 2; i++) {
            
            
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int a = nums[i];
            int target = -a;
           
            int left = i + 1;
            int right = n - 1;

          
            while (left < right) {
                int currentSum = nums[left] + nums[right];

                if (currentSum == target) {
                    
                    results.add(Arrays.asList(a, nums[left], nums[right]));

                  
                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                 
                    left++;
                    right--;

                } else if (currentSum < target) {
                   
                    left++;
                } else { 
                   
                    right--;
                }
            }
        }
        
       
        return results;
    }
}