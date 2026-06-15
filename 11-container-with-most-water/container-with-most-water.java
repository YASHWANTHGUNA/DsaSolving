class Solution {
    public int maxArea(int[] height) {
        int n = height.length; 
        int left = 0; 
        int right = height.length-1; 
        int maxArea = 0; 
        while(left <= right) {
            int currentWidth = right-left; 
            int currentArea = Math.min(height[left], height[right]) * currentWidth; 
            maxArea = Math.max(maxArea, currentArea); 
            if(height[left] < height[right]) {
                left++;
            } else {
                right--; 
            }
        }
        return maxArea; 

        
    }
}