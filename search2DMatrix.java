class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int index = 0;
        
        while(left <= right) {   
            int mid = (left + right) / 2;
            if(target > matrix[mid][n-1])
                left = mid+1;
            else if(target < matrix[mid][0])
                right = mid-1;
            else {    
                index = mid;
                break;
            }
        }
        
        left = 0;
        right = n-1;        

        while(left <= right) {
            int mid = (left + right) / 2;
            if(target == matrix[index][mid])
                return true;
            else if(target > matrix[index][mid])
                left = mid+1;
            else
                right = mid-1;           
        }
        return false;
    }
}
