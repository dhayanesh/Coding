class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for(int i = 0; i < cols; i++) {
            //do dfs from pacific top side and finds taller cells
            dfs(heights, 0, i, pacific, heights[0][i]);

            //do dfs from atlantic bottom side and finds taller cells (can be done in separate loop also, but doing here itself)
            dfs(heights, rows-1, i, atlantic, heights[rows-1][i]);
        }

        for(int i = 0; i < rows; i++) {
            //do dfs from pacific left side and finds taller cells
            dfs(heights, i, 0, pacific, heights[i][0]);

            //do dfs from atlantic right side and finds taller cells (can be done in separate loop also, but doing here itself)
            dfs(heights, i, cols-1, atlantic, heights[i][cols-1]);
        }

        //find common of pacific and atlantic
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    res.add(cell);
                }
            }
        }

        return res;
    }

    public void dfs(int[][] heights, int x, int y, boolean[][] visit, int prevHeight) {
        if(x < 0 || y < 0 || x > heights.length - 1 || y > heights[0].length - 1 || visit[x][y] || heights[x][y] < prevHeight)
            return;
        
        visit[x][y] = true;
        dfs(heights, x + 1, y, visit, heights[x][y]);
        dfs(heights, x, y + 1, visit, heights[x][y]);
        dfs(heights, x - 1, y, visit, heights[x][y]);
        dfs(heights, x, y - 1, visit, heights[x][y]);

        return;
    }
}
