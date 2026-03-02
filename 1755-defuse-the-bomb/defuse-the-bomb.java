class Solution {
    public int[] decrypt(int[] code, int k) {
       int n = code.length; 
       
       int[] ans = new int[n]; 
       if(k==0) {
        return ans; 
       }
       int idx = 0; 
       for(int i = 0; i < n; i++) {
         int sum = 0; 
         for(int j = 1; j <= Math.abs(k); j++) {
            if(k > 0) {
               
                idx  = (i+j+n) % n; 
            } else {
                idx = (i-j+n) % n;  
                
            }
            sum += code[idx]; 
         }
         ans[i] = sum; 
       }
        return ans; 
    }
}