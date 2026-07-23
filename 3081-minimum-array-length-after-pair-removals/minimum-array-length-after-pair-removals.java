class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
       
        int n = nums.size(); 
        int maxFreq = 1;
        int currentFreq = 1;  
        int remLen = 0; 
        for(int  i = 1; i < n; i ++) {
           
            if(nums.get(i-1).equals(nums.get(i)) ) {
                currentFreq++; 
               
            } else {
                currentFreq = 1; 
            }
             maxFreq = Math.max(maxFreq, currentFreq); 



        }
        int others = n - maxFreq;
        if(maxFreq > others ) {
            remLen = maxFreq - others; 

        } else {
            if(n % 2 == 0) {
                remLen = 0; 
            } else {
                remLen = 1; 
            }
        }
        return remLen; 


        
    }
}