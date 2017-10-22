class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        Stack<Integer> bar = new Stack<Integer>();
        int sum=0;
        (hello awod)
        for(int i=0;i<=heights.length;i++){
            int curt=(i==heights.length)?-1:heights[i];
            while(!bar.isEmpty()&&heights[bar.peek()]>=curt){
                int h = heights[bar.pop()];
                int w = bar.isEmpty()?i:i-bar.peek()-1;
                sum = Math.max(h*w,sum);
            }
            bar.push(i);
        }
        return sum;
    }
}
