class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length; 
        if(colors[0] != colors[n-1]) {
            return n-1; 
        }
        int j = n-1; 
        while(j >= 0 && colors[j]==colors[n-1]) {
            j--; 
        }

        int max1 = j; 
        int i = 0; 
        while(i < n && colors[i] == colors[n-1]) {
            i++; 
        }
        int max2 = (n-1)-i; 
        return Math.max(max1, max2); 
    }
}