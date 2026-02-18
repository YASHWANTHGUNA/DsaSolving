class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int n= arr.length; 
        Arrays.sort(arr);
        int m_index = (n-1)/2; 
        int m = arr[m_index]; 
        int l = 0; 
        int r = n-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(l <= r && k > 0) {
            int left = Math.abs(arr[l]-m); 
            int right = Math.abs(arr[r]-m); 
            if(left > right) {
                res.add(arr[l]); 
                l++; 
                k--; 
            } else if(right > left) {
                res.add(arr[r]); 
                r--;
                k--;
            } else {
                res.add(arr[r]);
                r--; 
                k--; 
            }
        } 
           int[] ans = new int[res.size()];
             for (int i = 0; i < res.size(); i++) {
                ans[i] = res.get(i);
            }
            return ans;
        
    }
}