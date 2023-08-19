class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        for(int i = 0; i < graph[0].length; i++) {
            List<Integer> initialPath = new ArrayList<>();
            initialPath.add(0);
            visited[0] = true;
            dfs(graph, result, initialPath, graph[0][i], visited);
        }

        return result;
    }

    public void dfs(int[][] graph, List<List<Integer>> result, List<Integer> initialPath, int node, boolean[] visited) {
        initialPath.add(node);
        visited[node] = true;

        if(node == graph.length - 1) {
            result.add(new ArrayList<>(initialPath));
        } else {
            for(int i = 0; i < graph[node].length; i++) {
                if(!visited[graph[node][i]]) {
                    dfs(graph, result, initialPath, graph[node][i], visited);
                }
            }
        }
        initialPath.remove(initialPath.size() - 1);
        visited[node] = false;
    }
}
