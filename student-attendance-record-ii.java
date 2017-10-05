public class Solution{
    private final int mod = 1000000007;

    public int checkRecord(int n){
        int dp[][] = {{1,1,0},{1,0,0}};
        for(int i=2;i<=n;i++){
            int[][] temp = {{0,0,0},{0,0,0}};
            ndp[0][0]=(int)sum(dp[0]);
            ndp[0][1]=dp[0][0];
            ndp[0][2]=dp[0][1];
            ndp[1][0]=(int)((sum(dp[0])+sum(dp[1]))%mod);
            ndp[1][1]=dp[1][0];
            ndp[1][2]=dp[1][1];
            dp = ndp;
        }
        return (int)((sum(dp[0])+sum(dp[1]))%mod);
    }
    public long sum(int[] nums){
        long res =0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        return res%mod;
    }
}
