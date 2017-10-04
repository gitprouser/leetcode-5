class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int max_ans,cnt;
        int[] dp=new int[nums.length];
        int[] ans=new int[nums.length];
        dp[0]=1;
        max_ans=1;
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            dp[i]=1;
            ans[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]&&dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    ans[i]=ans[j];
                }else if(nums[j]<nums[i]&&dp[j]+1==dp[i]){
                    ans[i]+=ans[j];
                }
                if(dp[i]>max_ans){
                    max_ans=dp[i];
                }
            }
        }
        cnt=0;
        for(int i=0;i<nums.length;i++){
                if(dp[i]==max_ans) cnt+=ans[i];
        }
        return cnt;
    }
}
