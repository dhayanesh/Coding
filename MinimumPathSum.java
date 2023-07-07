public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] dp = new int[m][n];
        
        dp[m-1][n-1] = grid[m-1][n-1];
        
        //either move right or down
        //fill the last row
        for (int i = n - 2; i >= 0; i--) {
            dp[m-1][i] = dp[m-1][i+1] + grid[m-1][i];
        }
        
        //fill the last column
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n-1] = dp[i+1][n-1] + grid[i][n-1];
        }
        
        // Fill the rest of the dp table
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + grid[i][j];
            }
        }
        
        return dp[0][0];
    }
}
