class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            while(nums[i]!=i+1){
                int temp=nums[nums[i]-1];
                if(temp==nums[i]){
                    break;
                }
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
