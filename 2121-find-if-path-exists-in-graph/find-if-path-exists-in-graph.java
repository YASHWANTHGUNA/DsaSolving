class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
      
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
       
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
       
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
      
        queue.offer(source);
        visited[source] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
           
            if (current == destination) {
                return true;
            }

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
      
        return false;
    }
}