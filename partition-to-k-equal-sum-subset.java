class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum =0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%k>0) return false;
        int target = sum/k;
        Arrays.sort(nums);
        int len = nums.length-1;
        if(nums[len]>target) return false;
        while(len>=0&&nums[len]==target){
            len--;
            k--;
        }
        int[] group = new int[k];
        return search(group,nums,len,target);
    }
    
    public boolean search(int[] group,int[] nums,int len,int target){
        if(len<0) return true;
        int temp =nums[len--];
        for(int i=0;i<group.length;i++){
            if(group[i]+temp<=target){
                group[i]+=temp;
                if( search(group,nums,len,target)==true) return true;
                group[i]-=temp;
            }
            if(group[i]==0) break;
        }
        return false;
    }
}
