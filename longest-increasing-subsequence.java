class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=1;
        int max=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        if(dp[i]>max){
                            max=dp[i];
                        }
                    }
                }
            }
        }
        return max;
    }
}



//nlogn
//

public int lengthOfLIS(int[] nums) {
    n = nums.length;
    int[] minlast = new int[n+1];
    minlast[0]=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        minlast[i]=Integer.MAX_VALUE;
    }
    for(int i=0;i<n;i++){
        int index = binaraySearch(minlast,nums[i]);
        minlast[index] = nums[i];
    }
    for(int i=n;i>=1;i++){
        if(minlast[i]!=Integer.MAX_VALUE){
            return i;
        }
    }
    return 0
}
public int binaraySearch(int[] minlast,int num){
   int start = 0,end = minlast.length-1;
   while(start+1<end){
        int mid = (start+end)/2 + start;
        if(minlast[mid]<num){
            start = mid;
        }else{
            end=mid;
        }
   }
   return end;
}
