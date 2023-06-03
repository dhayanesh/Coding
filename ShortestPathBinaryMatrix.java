class Solution {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    int minPathLength;
    int m, n;

    public int shortestPathBinaryMatrix(int[][] grid) {      
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }


        minPathLength = Integer.MAX_VALUE;
        m = grid.length;
        n = grid[0].length;
        dfs(grid, 0, 0, 1);
                
                
        return minPathLength == Integer.MAX_VALUE ? -1 : minPathLength;

    }

    public void dfs(int[][] grid, int x, int y, int pathLength) {
        if (pathLength + Math.max(m - 1 - x, n - 1 - y) >= minPathLength) {
            return;  //estimate of minimum number of steps required to reach the goal from current cell, under the assumption that we can only move downwards or right.
        }

        if (x == m - 1 && y == n - 1) {
            minPathLength = pathLength;
            return;
        }

        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 0) {
                grid[newX][newY] = 1;
                dfs(grid, newX, newY, pathLength + 1);
                grid[newX][newY] = 0;  //unmark after visit
            }
        }

    }
}
