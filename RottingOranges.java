class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        int time = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    queue.offer(arr); 
                }
                else if(grid[i][j] == 1) {
                    fresh += 1;
                }
            }
        }

        int[][] directions = {{ 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }};

        while(!queue.isEmpty() && fresh > 0) {
            int qSize = queue.size();
            //wave - 1, 2, 3...
            for(int i = 0; i < qSize; i++) {
                int[] rotten = queue.poll();
                int r = rotten[0], c = rotten[1];
                for (int[] dir : directions) {
                    int x = r + dir[0], y = c + dir[1];
                    if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        queue.offer(new int[] { x, y });
                        fresh -= 1;
                    }    
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}
