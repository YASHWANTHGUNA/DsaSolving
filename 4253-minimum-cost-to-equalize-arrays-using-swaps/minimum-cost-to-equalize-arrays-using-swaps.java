class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> total = new HashMap<>(); 
        HashMap<Integer, Integer> freq1 = new HashMap<>(); 
        for(int x : nums1) {
            freq1.put(x, freq1.getOrDefault(x,0)+1); 
        }
        for(int x : nums1) {
            total.put(x, total.getOrDefault(x, 0)+1); 
        }
        for(int x : nums2) {
            total.put(x, total.getOrDefault(x, 0)+1); 
        }
        for(int key : total.keySet()) {
            if(total.get(key) % 2 != 0) {
                return -1; 
            }
        }
        int swaps = 0; 
        for(int key : total.keySet()) {
            int target = total.get(key)/2; 
            int f1 = freq1.getOrDefault(key, 0); 
            if(f1 > target) {
                swaps += (f1-target); 
            }
        }
        return swaps; 
        
    }
}