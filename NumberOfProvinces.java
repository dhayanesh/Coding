class Solution {
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length, provinces = 0;
        boolean[] visited = new boolean[len];

        for(int i = 0; i < len; i++) {
            if(!visited[i]) {
                dfs(isConnected, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int curr) {
        for(int j = 0; j < isConnected[curr].length; j++) {
            if(!visited[j] && isConnected[curr][j] == 1) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}
