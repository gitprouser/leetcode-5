class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length==0){
            return new int[0];
        }
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int[] res = new int[nums.length-k+1];
        
        for(int i=0;i<nums.length;i++){
            if(!deque.isEmpty()&&deque.peekFirst()==i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            if((i+1)>=k){
                res[i+1-k]=nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
