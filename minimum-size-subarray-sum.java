class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0,j=0;
        int sum=0;
        int res = Integer.MAX_VALUE;
        for(i=0;i<nums.length;i++){
            while(j<nums.length&&sum<s){
                sum+=nums[j];
                j++;
            }
            if(sum>=s){
                res=Math.min(res,j-i);
            }
            sum-=nums[i];
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}
