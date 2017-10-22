class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return matrix;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    q.offer(new int[]{i,j});
                }else{
                    matrix[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int[][] dies = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] cell=q.poll();
            for(int[] d:dies){
                int row=cell[0]+d[0];
                int col=cell[1]+d[1];
                if(row<0||row>=m||col<0||col>=n){
                    continue;
                }
                int value = matrix[row][col];
                int temp = matrix[cell[0]][cell[1]]+1;
                if(value<=temp){
                    continue;
                }
                q.offer(new int[]{row,col});
                matrix[row][col]=temp;
            }
        }
        return matrix;
    }
}
