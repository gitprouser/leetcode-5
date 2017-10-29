class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // int[] temp =new int[nums.length];
        // System.arraycopy(nums,0,temp,0,nums.length);
        // Arrays.sort(nums);
        // int start=0,end=nums.length-1;
        // while(start<nums.length&&nums[start]==temp[start]){
        //     start++;
        // }
        // while(end>start&&nums[end]==temp[end]){
        //     end--;
        // }
        // return end-start+1;
        int end=-2,beg=-1;
        int len = nums.length;
        int max=nums[0],min = nums[len-1];
        for(int i=0;i<len;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[len-1-i]);
            if(nums[i]<max) end=i;
            if(nums[len-1-i]>min) beg=len-1-i;
        }
        return end-beg+1;
    }
}
