class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b)-> a[1]-b[1]);
        int count = 0; 
        int currEnd = Integer.MIN_VALUE;
        for(int[] p : pairs) {
            if(p[0] > currEnd) {
                count++; 
                currEnd = p[1]; 
            }
        }
        return count;
        
    }
}