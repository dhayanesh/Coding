class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }


        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, adjacencyList, visited);
    }

    public boolean dfs(int source, int destination, List<List<Integer>> adjacencyList, boolean[] visited) {

        if(source == destination)
            return true;
        
        visited[source] = true;

        for(int next: adjacencyList.get(source)) {
            if(!visited[next] && dfs(next, destination, adjacencyList, visited)) 
                return true;
        }
        return false;
    }
}
