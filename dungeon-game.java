class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] max = new int[m][n];
        max[m-1][n-1]=Math.max(1-dungeon[m-1][n-1],1);
        for(int i=m-2;i>=0;i--){
            max[i][n-1]=Math.max(1,max[i+1][n-1]-dungeon[i][n-1]);
        }
        for(int i=n-2;i>=0;i--){
            max[m-1][i]=Math.max(1,max[m-1][i+1]-dungeon[m-1][i]);
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                max[i][j]=Math.max(Math.min(max[i][j+1],max[i+1][j])-dungeon[i][j],1);
            }
        }
        return max[0][0];
    }
}
