class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1)
                    perimeter += dfs(grid, i, j);
            }
        }
        return perimeter;
    }

    public int dfs(int[][] grid, int x, int y) {
        //if no neighbour island or island is on the sides, return 1 for that direction
        if(x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] == 0)
            return 1;
            
        //return 0 if there is a neighbour island that is visited
        if (grid[x][y] == 2) 
            return 0;
        
        grid[x][y] = 2;
        int perimeter = 0;

        perimeter += dfs(grid, x + 1, y); 
        perimeter += dfs(grid, x, y + 1);
        perimeter += dfs(grid, x - 1, y);
        perimeter += dfs(grid, x, y - 1);
        return perimeter;
    }
}
