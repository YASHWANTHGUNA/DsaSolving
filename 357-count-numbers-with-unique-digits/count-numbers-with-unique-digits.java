class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int ans = 1; 
        int count = 1;
        int available= 9;  
        for(int len = 1; len <= n; len++) {
            count *= available; 
            ans += count; 
            if(len > 1) {
                available--;
            }

           

        }
        return ans; 
        
    }
}