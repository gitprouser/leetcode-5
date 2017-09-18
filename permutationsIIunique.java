class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        dfs(nums,0,nums.length-1);
        List<List<Integer>> up = new ArrayList<List<Integer>>(new HashSet<List<Integer>>(res));
        return up;
    }
    public void dfs(int[] nums,int start,int end){
        if (start>=end){
            List<Integer> temp = new ArrayList<Integer>();
            for (int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            res.add(temp);
        }else{
            for (int i=start;i<nums.length;i++){
                    swap(nums,start,i);
                    dfs(nums,start+1,end);
                    swap(nums,start,i);
                }
            }
    }
    public void swap(int[] nums,int start,int end){
        int temp = nums[end];
        nums[end]=nums[start];
        nums[start]= temp;
    }     
}
    
