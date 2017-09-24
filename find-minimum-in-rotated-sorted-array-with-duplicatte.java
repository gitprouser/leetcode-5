class Solution {
    public int findMin(int[] nums) {
        if(nums==null){
            return 0;
        }
        int n= nums.length;
        if(n==1){
            return nums[0];
        }
        int left=0,right=n-1;
        while(left<right-1){
            if(nums[left]<nums[right]){
                return nums[left];
            }
            int mid = (left+right)/2;
            if(nums[mid]>nums[right]){
                left=mid;
            }else if(nums[mid]<nums[left]){
                right = mid;
            }else{
                left++;
            }
        }
        return Math.min(nums[left],nums[right]);
    }
}
