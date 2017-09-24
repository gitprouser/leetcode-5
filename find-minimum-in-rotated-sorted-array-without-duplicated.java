class Solution {
    public int findMin(int[] nums) {
        int left = 0,right=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums==null){
            return 0;
        }
        while(left<right-1){
            int mid = (left+right)/2;
            if(nums[left]<nums[right]){
                return nums[left];
            }
            if(nums[mid]>nums[left]){
                left=mid;
            }else{
                right=mid;
            }
        }
        return Math.min(nums[left],nums[right]);
    }
}
