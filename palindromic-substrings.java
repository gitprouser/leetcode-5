class Solution {
    public int countSubstrings(String s) {
        int size = s.length();
        int res=0;
        boolean[][] dp = new boolean[size][size];
        for(int i=size-1;i>=0;i--){
            for(int j=i;j<size;j++){
                dp[i][j]=((s.charAt(i)==s.charAt(j))&&(j-i<=2||dp[i+1][j-1]));
                if(dp[i][j]==true) res++;
            }
        }
        return res;
    }
}
