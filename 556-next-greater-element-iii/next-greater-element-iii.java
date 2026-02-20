class Solution {
    public int nextGreaterElement(int n) {

        
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }

    
        int breakindex = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                breakindex = i;
                break;
            }
        }

        
        if (breakindex == -1) return -1;

        int breakElement = digits[breakindex];

       
        int targetIndex = -1;
        for (int i = breakindex + 1; i < digits.length; i++) {
            if (digits[i] > breakElement) {
                if (targetIndex == -1 || digits[i] < digits[targetIndex]) {
                    targetIndex = i;
                }
            }
        }

     
        int temp = digits[breakindex];
        digits[breakindex] = digits[targetIndex];
        digits[targetIndex] = temp;

        Arrays.sort(digits, breakindex + 1, digits.length);
  
        long result = 0;
        for (int d : digits) {
            result = result * 10 + d;
        }

        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }
}