class Solution {
    public void gameOfLife(int[][] board) {
        int[][] arr = { {1, 0}, {0, 1}, {-1, 0}, {0, -1}, {-1, -1}, {1, 1}, {-1, 1}, {1, -1}};
        boolean[][] temp = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                int count = isAlive(board, i, j, arr);
                if(board[i][j] == 1 && (count == 2 || count == 3))
                    temp[i][j] = true;
                else if(board[i][j] == 0 && count == 3)
                    temp[i][j] = true;
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(temp[i][j])
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
            }
        }

    }

    int isAlive(int[][] board, int i, int j, int[][] arr) {
        int count = 0;
        for(int[] dir : arr) {
            int x = i + dir[0];
            int y = j + dir[1];
            if(x < 0 || y < 0 || x >= board.length || y >= board[0].length)
                continue;
            if(board[x][y] == 1)
                count++;
        }
        return count;
    }
}
