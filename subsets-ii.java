class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length==0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        Arrays.sort(nums);
        helper(new ArrayList<Integer>(),nums,0,res);
        return res;
    }
    
    public void helper(List<Integer> temp,int[] nums,int start,List<List<Integer>> res){
        res.add(new ArrayList<Integer>(temp));
        for(int i=start;i<nums.length;i++){
            if(i != start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            helper(temp,nums,i+1,res);
            temp.remove(temp.size()-1);
        }
        return;
    }
}
