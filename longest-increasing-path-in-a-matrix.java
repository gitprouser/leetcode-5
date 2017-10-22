class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp =new int[m][n];
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res= Math.max(res,helper(matrix,dp,i,j));
            }
        }
        return res+1;
    }
    public int helper(int[][] matrix,int[][] dp,int i,int j){
        int m = matrix.length;
        int n = matrix[0].length;
        if(dp[i][j]!=0) return dp[i][j];
        int[][] dies = {{-1,0},{1,0},{0,-1},{0,1}};
        int max=0;
        for(int[] d:dies){
            int row=i+d[0];
            int col=j+d[1];
            if(row<0||row>=m||col<0||col>=n||matrix[i][j]>=matrix[row][col]){
                continue;
            }
            int len = 1+helper(matrix,dp,row,col);
            max = Math.max(max,len);
        }
        dp[i][j]=max;
        return max;
    }
}
