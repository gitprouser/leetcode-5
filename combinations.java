class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        helper(nums,k,res,temp,0);
        return res;
    }
    public void helper(int[] nums,int k,List<List<Integer>> res,List<Integer> temp,int index){
        if(temp.size()==k){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        if(index>=nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            helper(nums,k,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }
    
}
