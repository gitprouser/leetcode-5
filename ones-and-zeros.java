class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];   
        for(String str:strs){
            int o=0;
            int z=0;
            for(char c:str.toCharArray()){
                if(c=='0') o++;
                else z++;
            }
            for(int i=m;i>=o;i--){
                for(int j=n;j>=z;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-o][j-z]+1);
                }
            }
        }
        return dp[m][n];
    }
}
