class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(strs == null || strs.length ==0) { //Base condition for edge cases to avoid arrays out of bounds exception result
            return "";
        }
        for(int i = 0; i < strs[n-1].length(); i++) {
            char c = strs[n-1].charAt(i); //Character to check 
            for(int j = 0; j < n; j++) {
                    if(i == strs[j].length() || strs[j].charAt(i) != c) {
                        return strs[n-1].substring(0,i);
                    }
            }
        }
          return  strs[n-1];
    }
}