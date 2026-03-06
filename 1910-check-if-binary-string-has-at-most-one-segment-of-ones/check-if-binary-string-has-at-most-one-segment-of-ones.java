class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zeroSeen = false; 
        for(char ch : s.toCharArray()) {
            if(ch == '0') zeroSeen = true; 
            if( zeroSeen &&  ch == '1' ) {
                return false; 
            }
        }
        return true; 
        
    }
}