class Solution {
    public int minMoves(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i]<min) {
                min = nums[i];
            }
        }
        int res = 0;
        for(int i=0;i<len;i++){
            res+=(nums[i]-min);
        }
        return res;
    }
}
