class Solution {
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();

        boolean found = false;
        for(int i = 0; i < n && !found; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, n, i, j, queue);
                    found = true;
                    break;
                }
            }
        }
        
        int distance = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();  
                for(int[] dirs: directions) {
                    int x = cur[0] + dirs[0];
                    int y = cur[1] + dirs[1];
                    if (x < 0 || x >= n || y < 0 || y >= n || grid[x][y] == 2) {
                        continue;
                    }
                    if (grid[x][y] == 1) {
                        return distance;
                    }
                    queue.add(new int[]{x, y});
                    grid[x][y] = 2;
                }
            }
            distance += 1;
        }
        return -1;
    }

    public void dfs(int[][] grid, int n, int i, int j, Queue<int[]> queue) {
        if(i < 0 || j < 0 || i >= n || j >= n || grid[i][j] == 0 || grid[i][j] == 2)
            return;
        
        int[] arr = new int[2];
        arr[0] = i;
        arr[1] = j;
        queue.offer(arr);

        grid[i][j] = 2;
        dfs(grid, n, i + 1, j, queue);
        dfs(grid, n, i, j + 1, queue);
        dfs(grid, n, i - 1, j, queue);
        dfs(grid, n, i, j - 1, queue);
    }
}
