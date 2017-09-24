class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return new int[]{-1,-1};
        }
        int left=0,right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[left]==nums[right]){
                if(nums[left]==target){
                    return new int[]{left,right};    
                }else{
                    return new int[]{-1,-1};
                }
                
            }else{
                if(target==nums[mid]){
                    if(nums[left]<nums[mid]){
                        left++;
                    }
                    if(nums[right]>nums[mid]){
                        right--;
                    }
                }else if(target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
