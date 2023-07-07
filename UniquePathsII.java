class Solution {
    HashMap<String, Integer> hm = new HashMap<>();
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return pathFinder(obstacleGrid, m - 1, n - 1, hm);
    }

    public int pathFinder(int[][] obstacleGrid, int m, int n, HashMap <String, Integer> hm) {
        if(m == -1 || n == -1)
            return 0;
        if(obstacleGrid[m][n] == 1)
            return 0;
        if(m == 0 && n == 0)
            return 1;
        String key = m + "," + n;
        if(hm.containsKey(key))
            return hm.get(key);
        int res = pathFinder(obstacleGrid, m - 1, n, hm) + pathFinder(obstacleGrid, m, n - 1, hm);
        hm.put(key, res);
        return res;
    }
}
