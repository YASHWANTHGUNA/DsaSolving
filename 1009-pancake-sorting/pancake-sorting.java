class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length; 
        List<Integer> ans = new ArrayList<>(); 
        for(int size = n; size  > 1; size--) {
            int maxIdx = 0; 
            for(int  i = 1; i < size; i++) {
                if(arr[i]  > arr[maxIdx]) {
                    maxIdx = i; 
                }
            }
            if(maxIdx == size-1) {
                continue; 
            }
            if(maxIdx != 0 ) {
                reverse(arr, 0, maxIdx); 
                ans.add(maxIdx+1); 
            }
            reverse(arr, 0, size-1); 
            ans.add(size); 

        }     
        return ans;    
    }
    private void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }
    }
}