class Solution {
    public String optimalDivision(int[] nums) {
        String res="";
        if(nums.length==0)return res;
        res=nums[0]+"";
        if(nums.length==1)return res;
        if(nums.length==2)return res+"/"+nums[1];
        res+="/("+nums[1];
        for(int i=2;i<nums.length;i++){
            res+="/"+nums[i];
        }
        res+=")";
        return res;
    }
}
