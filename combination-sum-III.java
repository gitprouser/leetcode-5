class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int[] nums=new int[9];
        for(int i=0;i<9;i++){
            nums[i]=i+1;
        }
        helper(k,n,nums,0,res,temp);
        return res;
    }
    public void helper(int k,int n,int[] nums,int index,List<List<Integer>> res,List<Integer> temp){
        if(temp.size()==k){
            if(n==0){
                res.add(new ArrayList<Integer>(temp));   
            }
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(nums[i]>n){                
                return;
            }
            temp.add(nums[i]);
            helper(k,n-nums[i],nums,i+1,res,temp);
            temp.remove(temp.size()-1);
            
        }
    }
}
