class Solution {
    public int jump(int[] nums) {
        if(nums==null||nums.length==1){
            return 0;
        }
        
        int count=0;
        int start=0,end=0;
        while(end<nums.length){
            count++;
            int reach=0;
            for(int i=start;i<=end;i++){
                if(nums[i]+i>=nums.length-1){
                    return count;
                }
                reach=Math.max(reach,nums[i]+i);
            }
            start=end+1;
            end=reach;
        }
        return count;
    }
}

