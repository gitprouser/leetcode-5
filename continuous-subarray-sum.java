class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k) return true;//k=0
        //         if(k!=0&&sum%k==0)return true;
        //     }
        // }
        // return false;
        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int temp = (k==0)? sum:(sum%k);
            if(map.containsKey(temp)){
                if(i-map.get(temp)>1) return true;
            }else{
                map.put(temp,i);
            }
        }
        return false;
    }
}
