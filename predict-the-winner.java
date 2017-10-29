class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=nums[i];
        }
        for(int l=1;l<n;l++){
            for(int i=0;i<n-l;i++){
                int j=l+i;
                dp[i][j]=Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
        }
        // return dp[0][n-1]>=0;
        return helper(0,n-1,nums)>=0;
    }
    
    public int helper(int start,int end,int[] nums){
        if(start==end){
            return nums[start];
        }else{
            return Math.max(nums[start]-helper(start+1,end,nums),nums[end]-helper(start,end-1,nums));
        }
    }
}
