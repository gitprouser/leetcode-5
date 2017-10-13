class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Queue<Integer> que = new PriorityQueue<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     que.add(nums[i]);
        //     if(que.size()>k){
        //         que.poll();
        //     }
        // }
        // return que.poll();
        
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }
        return select(nums,0,nums.length-1,nums.length-k);
    }
    public int select(int[] nums,int l,int r,int k){
        if(l==r){
            return nums[l];
        }
        int pivot = partition(nums,l,r);
        if(pivot==k){
            return nums[pivot];
        }else if(pivot<k){
            return select(nums,pivot+1,r,k);
        }else{
            return select(nums,l,pivot-1,k);
        }
    }
    public int partition(int[] nums,int l,int r){
        int pivot = nums[l];
        while(l<r){
            while(l<r&&nums[r]>=pivot){
                r--;
            }
            nums[l]=nums[r];
            while(l<r&&nums[l]<=pivot){
                l++;
            }
            nums[r]=nums[l];
        }
        nums[l]=pivot;
        return l;
    }
}
