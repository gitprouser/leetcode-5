class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = matrix[j][n-i-1];
                matrix[j][n-i-1]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i; j++) {
                int temp = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }    
    }
}
