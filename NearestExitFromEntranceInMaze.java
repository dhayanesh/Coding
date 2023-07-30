class Solution {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(entrance);
        visited[entrance[0]][entrance[1]] = true;
        int steps = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];

                if (steps != 0 && (row == 0 || col == 0 || row == m - 1 || col == n - 1)) {
                    return steps;
                }

                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol] && maze[newRow][newCol] == '.') {
                        queue.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
