class Solution {
    public int numDistinct(String s, String t) {
         if (s == null || s == null) {
            return 0;
        }
        int m = s.length()+1;
        int n = t.length()+1;
        if(m<n){
            return 0;
        }
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j];
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]+=dp[i-1][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
