class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums==null){
            return 1;
        }
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]!=(i+1)&&nums[i]>0&&nums[i]<=n){
                int temp=nums[nums[i]-1];
                if(temp==nums[i]){
                    break;
                }
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}
