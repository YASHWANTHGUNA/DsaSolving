class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        int n = nums.length; 
        for(int i = 0; i  < (1<<n); i++) {
            List<Integer> inner = new ArrayList<>();
            for(int k = 0; k < n; k++) {
                if((i & 1<<k)!=0) {
                    inner.add(nums[k]);
                }
            }
            outer.add(inner);
        }
        return outer; 
        
    }
}