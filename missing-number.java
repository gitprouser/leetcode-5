class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null){
            return 0;
        }
        int n =nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]!=i&&nums[i]<n){
                int temp = nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i)
                return i;
        }
        return nums.length;
    }
}
