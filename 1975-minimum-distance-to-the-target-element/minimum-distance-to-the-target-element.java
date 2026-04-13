class Solution {
    public int getMinDistance(int[] nums, int target, int start ) {
        int n = nums.length; 
        int mindistance=  Integer.MAX_VALUE; 

        for(int i = 0; i < n; i++) {
            if(nums[i]==target ) {
                mindistance = Math.min(mindistance, Math.abs(i-start));
            }
        }
        return mindistance;
    }
}