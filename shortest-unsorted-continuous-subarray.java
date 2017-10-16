class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp =new int[nums.length];
        System.arraycopy(nums,0,temp,0,nums.length);
        Arrays.sort(nums);
        int start=0,end=nums.length-1;
        while(start<nums.length&&nums[start]==temp[start]){
            start++;
        }
        while(end>start&&nums[end]==temp[end]){
            end--;
        }
        return end-start+1;
    }
}
