class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    search(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void search(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        search(grid, i+1, j);
        search(grid, i-1, j);        
        search(grid, i, j + 1);
        search(grid, i, j - 1);

    }
}
