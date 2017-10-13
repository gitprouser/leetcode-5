class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int res = 0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                res=nums[i];
                count++;
            }else if(nums[i]==res){
                count++;
            }else{
                count--;
            }
        }
        return res;
    }
}
