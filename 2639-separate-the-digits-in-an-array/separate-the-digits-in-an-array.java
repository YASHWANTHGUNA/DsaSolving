class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length; 
        ArrayList<Integer> ans = new ArrayList<>(); 
        for(int num : nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            while( num  > 0) {
                int digit = num % 10; 
                temp.add(digit); 
                num = num / 10; 
            }
            for(int  i = temp.size()-1; i >= 0; i--) {
                ans.add(temp.get(i)); 

            }

            

        }
        int[] result = new int[ans.size()]; 
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i); 

        }
        return result; 
        
    }
}