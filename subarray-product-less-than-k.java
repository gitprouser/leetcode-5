class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int temp = 1;
        int res=0,j=0;
        for(int i=0;i<nums.length;i++){
            temp*=nums[i];
            if(temp<k){
                res+=i-j+1;   
            }else{
                while(j<nums.length){
                    temp/=nums[j++];
                    if(temp<k) break;
                }
                if(temp<k){
                    res+=i-j+1;
                }
            }
        }
        return res;
    }
}
