iclass Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums,0,nums.length-1);
        return res;
    }
    
    public void dfs(int[] nums,int start,int end){
        if(start>=end){
            List<Integer> temp = new ArrayList<Integer>();
            for (int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            res.add(temp);
        }else{
            for(int i=start;i<nums.length;i++){
                swap(nums,start,i);
                dfs(nums,start+1,end);
                swap(nums,start,i);
            }
        }
    }
    public void swap(int[] nums,int left,int right){
        int temp = nums[right];
        nums[right]=nums[left];
        nums[left] = temp;
    }
}
