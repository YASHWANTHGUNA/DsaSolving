class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length; 
        int minLen = 0; 
        int leftEnd = 0; 
        int rightEnd = n-1; 
        
            while(leftEnd < n-1 && arr[leftEnd] <= arr[leftEnd+1]) {
                leftEnd++;
            }
            if(leftEnd == n-1)
                  return 0;
        
       
            while(rightEnd > 0 && arr[rightEnd-1] <= arr[rightEnd]) {
                rightEnd--; 
            }
            minLen = Math.min(n-leftEnd-1, rightEnd); 
            int i = 0; 
            int j = rightEnd; 
            while(i <= leftEnd && j < n) {
                if(arr[i] <= arr[j]) {
                    minLen = Math.min(minLen, j-i-1); 
                    i++;
                }  else {
                    j++;
                }
 

            }
            return minLen; 
        

        
    }
}