class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        
        List<HashMap<Integer, Integer>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dp.add(new HashMap<>());
        }
        
        int ans = 2; // minimum length
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                
                int diff = nums[i] - nums[j];
                
                int prev = dp.get(j).getOrDefault(diff, 1);
                int curr = prev + 1;
                
                dp.get(i).put(diff, 
                    Math.max(dp.get(i).getOrDefault(diff, 0), curr)
                );
                
                ans = Math.max(ans, curr);
            }
        }
        
        return ans;
    }
}