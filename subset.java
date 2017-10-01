class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null){
            return null;
        }
        if(nums.length==0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        Arrays.sort(nums);
        helper(new ArrayList<Integer>(),nums,0,res);
        return res;
    }
    
    public void helper(List<Integer> subset,int[] nums,int start, List<List<Integer>> res){
        res.add(new ArrayList<Integer>(subset));
        for(int i=start;i<nums.length;i++){
            subset.add(nums[i]);
            helper(subset,nums,i+1,res);
            subset.remove(subset.size()-1);
        }
        return ;
    }
    
}
