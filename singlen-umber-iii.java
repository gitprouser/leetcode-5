class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for (int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int lastBit = xor^(xor&(xor-1));
        int a=0,b=0;
        
        for (int i=0;i<nums.length;i++){
            if((lastBit&nums[i])==0){
                a^=nums[i];
            }else{
                b^=nums[i];
            }
        }
        int[] res = new int[2];
        res[0]=a;
        res[1]=b;
        return res;
    }
}
