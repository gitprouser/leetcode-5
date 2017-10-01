class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int one=0;
        for(int i=0;i<32;i++){
            one=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)==1){
                    one++;
                }
            }
            res+=one*(nums.length-one);
        }
        return res;
    }
}
