class Solution {
    public int singleNumber(int[] nums){
    int[] count = new int[32];
    int res = 0;
    for(int i=0;i<32;i++){
        for(int n=0;n<nums.length;n++){
            if(((nums[n]>>i)&1)==1){
                count[i]++;
            }
        }
        res|=(count[i]%3)<<i;
    }
    return res;
    }
}
