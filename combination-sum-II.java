class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> combin = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates,0,target,combin,res);
        return res;
    }
    public void helper(int[] candidates,int index,int target,List<Integer> combin,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<Integer>(combin));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i!=index&&candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            combin.add(candidates[i]);
            helper(candidates,i+1,target-candidates[i],combin,res);
            combin.remove(combin.size()-1);
        }
        return ;
    }
}
