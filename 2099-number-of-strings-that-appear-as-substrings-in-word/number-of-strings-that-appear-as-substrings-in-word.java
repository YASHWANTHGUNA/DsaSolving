class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0; 
        for(String pattern : patterns) {
            if(kmp(word, pattern)) {
                count++; 
            }
        }
        return count; 

        
    }
    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        lps[0] = 0;
        int len = 0;
        int i = 1; 
        while(i < pattern.length()) {
            if(pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len; 
                i++; 
            } else {
                if(len != 0) {
                    len = lps[len-1]; 
                } else {
                    lps[i] = 0; 
                    i++; 
                }
            }
        }
        return lps; 
        

         
        
         


    }
    private boolean kmp(String word, String pattern) {
        int[] lps = buildLPS(pattern); 
         int i = 0, j = 0; 
         while(j < word.length()) {
            if(pattern.charAt(i) == word.charAt(j)) {
                i++;
                j++;
                   if(i == pattern.length()) {
                   return true;
               }
            } else {
                if(i != 0) {
                    i = lps[i-1]; 

                } else {
                    j++;
                }
            }
         }
         return false; 
    }
}