class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int n:nums){
            set.add(n);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int up = nums[i]+1;
            while(set.contains(up)){
                set.remove(up);
                up++;
            }
            int down = nums[i]-1;
            while(set.contains(down)){
                set.remove(down);
                down--;
            }
            max = Math.max(max,up-down-1);
        }
        return max;
    }
}
