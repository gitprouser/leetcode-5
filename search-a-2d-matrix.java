class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int len = m * n;
        if(len==0){
            return false;
        }
        int start = 0, end = len-1, temp = 0, mid = 0;
        while (start <= end) {
            mid =start+ (end - start) / 2;
            temp = matrix[mid / n][mid % n];
            if (temp == target) {
                return true;
            } else if (temp > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
    
}
