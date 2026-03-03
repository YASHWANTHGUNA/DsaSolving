class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int oddSum = 0; 
        int n = arr.length; 
        for(int i = 0; i < n; i++) {
            int sum = 0; 
            for(int j = i; j < n; j++) {
                int len = j-i+1; 
                if(len % 2 == 1) {
                    
                   for(int k = i; k <= j; k++) {
                    sum += arr[k];
                   }
                }
            }
            oddSum += sum; 
        }
        return oddSum;  
    }
}