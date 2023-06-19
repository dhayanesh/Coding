class Solution {
    public void solve(char[][] board) {
        int row = board.length, col = board[0].length;

        //search for first row "O" and DFS for there
        for(int i = 0; i < col; i++) {
            if(board[0][i] == 'O')
                dfs(board, 0, i);
        }
        //search for first column "O" and DFS for there
        for(int i = 0; i < row; i++) {
            if(board[i][0] == 'O')
                dfs(board, i, 0);
        }
        //search for last row "O" and DFS for there
        for(int i = 0; i < col; i++) {
            if(board[row - 1][i] == 'O')
                dfs(board, row - 1, i);
        }
        //search for last column "O" and DFS for there
        for(int i = 0; i < row; i++) {
            if(board[i][col - 1] == 'O')
                dfs(board, i, col - 1);
        }

        //update "#" to "O" and  "O" to "X".
        for(int i = 0; i < row; i++) { 
            for(int j = 0; j < col; j++) {
                if(board[i][j] == 'O')  
                    board[i][j] = 'X';
                else if(board[i][j] == '#') 
                    board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'O')
            return;

        board[x][y] = '#';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);
    }
}
