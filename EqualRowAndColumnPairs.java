class Solution {
    public int equalPairs(int[][] grid) {
        int len = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        Map<String, Integer> colMap = new HashMap<>();

        for(int i = 0; i < len; i++) {
            String row = "";
            String col = "";
            for(int j = 0; j < len; j++) {
                row += grid[i][j] + ","; //to handle multi-digit
                col += grid[j][i] + ","; //n*n matrix
            }
            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
            colMap.put(col, colMap.getOrDefault(col, 0) + 1);
        }

        int count = 0;
        for(String s: rowMap.keySet()) {
            if(colMap.containsKey(s)) {
                count += rowMap.get(s) * colMap.get(s);;
            } 
        }
        return count;
    }
}
