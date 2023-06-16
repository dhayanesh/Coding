class Solution {
    boolean exists = false;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                dfs(board, word, row, col, i, j, 0);
                if(exists)
                    return true;
            }
        }
        return false;
    }

    public void dfs(char[][] board, String word, int row, int col, int i, int j, int pos) {
        if(pos == word.length()) {
            exists = true;
            return;
        }

        if (i >= row || i < 0 || j >= col || j < 0 || board[i][j] != word.charAt(pos))
            return;
        
        
        char temp = board[i][j];
        board[i][j] = '#';
        pos++;
        if(!exists) dfs(board, word, row, col, i + 1, j, pos);
        if(!exists) dfs(board, word, row, col, i, j + 1, pos);
        if(!exists) dfs(board, word, row, col, i - 1, j, pos);
        if(!exists) dfs(board, word, row, col, i, j - 1, pos);
        board[i][j] = temp;

    }
}
