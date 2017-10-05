class Solution {
    public int maximalRectangle(char[][] matrix) {
        if( matrix==null|| matrix.length==0){
            return 0;
        }
        int m= matrix.length;
        int n= matrix[0].length;
        int[][] heights=new int[m][n];
        for(int i=0;i<n;i++){
            if(matrix[0][i]=='1'){
                heights[0][i]=1;
            }else{
                heights[0][i]=0;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    heights[i][j]=heights[i-1][j]+1;
                }else{
                    heights[i][j]=0;
                }
            }
        }
        int max = 0;
        for(int i=0;i<m;i++){
            max = Math.max(max,maxRanctange(heights[i]));
        }
        return max;
    }
    public int maxRanctange(int[] nums){
        Stack<Integer> bar = new Stack<Integer>();
        int max=0;
        for(int i=0;i<=nums.length;i++){
            int cur = (i==nums.length)?-1:nums[i];
            while(!bar.isEmpty()&&nums[bar.peek()]>cur){
                int h = nums[bar.pop()];
                int w = bar.isEmpty()?i:i-bar.peek()-1;
                max = Math.max(max,h*w);
            }
            bar.push(i);
        }
        return max;
    }
}
