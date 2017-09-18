class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=0;
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]==target){
                return i;   
            }else if(nums[i]>target){
                break;
            }
        }
        return i;
    }
}
