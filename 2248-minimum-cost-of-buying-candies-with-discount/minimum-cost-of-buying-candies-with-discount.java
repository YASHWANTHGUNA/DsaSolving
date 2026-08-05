class Solution {
    public int minimumCost(int[] cost) {
        Integer[] cost1 = Arrays.stream(cost).boxed().toArray(Integer[]::new);
        Arrays.sort(cost1, Collections.reverseOrder()); 
        int totalCost = 0; 
        for(int i = 0; i < cost1.length; i++) {
            if(i % 3 == 2) {
                continue; 
            }
            totalCost += cost1[i];
        }
        return totalCost; 


        
    }
}