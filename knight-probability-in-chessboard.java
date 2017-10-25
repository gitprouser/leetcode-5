class Solution {
    public double knightProbability(int N, int K, int r, int c) {
        if(K==0){
            return 1;
        }
        int[][] move = {{1, 2}, {1, -2}, {2, 1}, {2, -1}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
        double[][] dp = new double[N][N];
        for(double[] row : dp) Arrays.fill(row, 1);
        for(int l=0;l<K;l++){
            double[][] dp1 = new double[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    for(int[] m:move){
                        int row=i+m[0];
                        int col=j+m[1];
                        if(isLegal(row,col,N)){
                            dp1[i][j]+=dp[row][col];
                        }
                    }
                }
            }
            dp=dp1;
        }
        return dp[r][c]/Math.pow(8,K);
    }
    private boolean isLegal(int r, int c, int len) {
        return r >= 0 && r < len && c >= 0 && c < len;
    }
}
