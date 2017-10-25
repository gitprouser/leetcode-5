//  DP[i][j][k] stands for how many possible ways to walk into cell j,k in step i
class Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
        long mod = 1000000007;
        long[][][] dp = new long[N+1][m][n];
        for(int k=1;k<=N;k++){
            for(int i0=0;i0<m;i0++){
                for(int j0=0;j0<n;j0++){
                    dp[k][i0][j0]+=i0 ==0? 1:dp[k-1][i0-1][j0];
                    dp[k][i0][j0]+=i0 ==m-1? 1:dp[k-1][i0+1][j0];
                    dp[k][i0][j0]+=j0 ==0? 1:dp[k-1][i0][j0-1];
                    dp[k][i0][j0]+=j0 ==n-1? 1:dp[k-1][i0][j0+1];
                    dp[k][i0][j0]%=mod;
                }
            }
        }
        return (int)dp[N][i][j];
    }
}
