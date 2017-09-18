class Solution {
    public void nextPermutation(int[] nums) {
        int end = nums.length-1;
        int start=0;
        int left=0,right=0;
        while(end>0){
            if(nums[end]>nums[end-1]){
                left=end-1;
                break;
            }
            end--;
        }
        for(int j=nums.length-1;j>=start;j--){
                    if(nums[j]>nums[left]){
                        right=j;
                        break;
                    }
        }
        swapItem(nums,left,right);
        if(left!=right){
            swapList(nums,left+1,nums.length-1);    
        }else{
            swapList(nums,0,nums.length-1);    
        }
        
        
    }
    
    public void swapList(int[] nums,int i,int j){
        while(i<j){
            swapItem(nums,i,j);
            i++;
            j--;
        }
    }
    public void swapItem(int[] nums,int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
}
