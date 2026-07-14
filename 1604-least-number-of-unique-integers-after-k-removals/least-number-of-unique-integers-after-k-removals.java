class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length; 
        Arrays.sort(arr); 
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i-1] == arr[i]) {
                count++; 

            } else {
                list.add(count); 
                count = 1; 
            }

             
            
 

        }
        list.add(count); 
        list.sort(null); 
        int removals = 0; 
        for(int i = 0; i < list.size(); i++) {
             if(k >= list.get(i)) {
                removals++; 
                k -= list.get(i); 
             }

        }
        return list.size()-removals;
        
    }
}