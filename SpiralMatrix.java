class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return list;
        } 

        int rowSt = 0;
        int rowEnd = matrix.length-1;
        int colSt = 0;
        int colEnd = matrix[0].length - 1;

        while(rowSt <= rowEnd && colSt <= colEnd) {
            //Right
            for (int i = colSt; i <= colEnd; i ++) {
                list.add(matrix[rowSt][i]);
            }
            rowSt++;
            //Down
            for (int i = rowSt; i <= rowEnd; i ++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            //Left
            if (rowSt <= rowEnd) {
                for (int i = colEnd; i >= colSt; i --) {
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;            
            //Up
            if (colSt <= colEnd) {
                for (int i = rowEnd; i >= rowSt; i --) {
                    list.add(matrix[i][colSt]);
                }
            }
            colSt++;
        }

        return list;  
    }
}
