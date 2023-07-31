class Solution {
    public int diagonalSum(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int sum = 0;

        for(int i = 0; i < mat.length; i++) {
            if(!visited[i][i]) {
                sum += mat[i][i];
                visited[i][i] = true;
            }
        }
        for(int i = 0; i < mat.length; i++) {
            if(!visited[mat.length - i - 1][i]) {
                sum += mat[mat.length - i - 1][i];
                visited[mat.length - i - 1][i] = true;
            }
        }
        return sum;
    }
}
