class Solution {
    public int minCut(String s) {
        int size =s.length();
        int[] dp = new int[size+1];
        boolean[][] ma = new boolean[size][size];
        for(int i=0;i<=size;i++){
            dp[i]=size-1-i;
        }
        for(int i=size-1;i>=0;i--){
            for(int j=i;j<size;j++){
                ma[i][j]=(s.charAt(i)==s.charAt(j)&&(j-i<=2||ma[i+1][j-1]==true));
                if(ma[i][j]==true){
                    dp[i]=Math.min(dp[i],dp[j+1]+1);
                }
            }
        }
        return dp[0];
    }
}
