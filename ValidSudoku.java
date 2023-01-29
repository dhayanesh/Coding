class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet set = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!set.add(number + "row" + i) ||
                        !set.add(number + "column" + j) ||
                        !set.add(number + "block" + i/3 + "#" + j/3))
                        return false;
            }
        }
        return true;
    }
}
