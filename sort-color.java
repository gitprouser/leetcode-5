class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        int i=0;
        int temp=0;
        while(i<=r){
            if(nums[i]==0){
                temp = nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                i++;
                l++;
            }else if(nums[i]==1){
                i++;
            }else{
                temp = nums[i];
                nums[i]=nums[r];
                nums[r]=temp;
                r--;
            }
        }
        // int r = 0,w=0,b=0;
        // for(int i=0;i<nums.length;i++){
        //     switch(nums[i]){
        //         case 0:r++;break;
        //         case 1:w++;break;
        //         case 2:b++;break;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(r!=0){
        //         nums[i]=0;
        //         r--;
        //         continue;
        //     }
        //     if(w!=0){
        //         nums[i]=1;
        //         w--;
        //         continue;
        //     }
        //     if(b!=0){
        //         nums[i]=2;
        //         b--;
        //         continue;
        //     }
        // }
    }
    
}
