//http://blog.csdn.net/linhuanmars/article/details/24506703
//dp[i][j][len]表示的是以i和j分别为s1和s2起点的长度为len的字符串是不是互为scramble。
class Solution {
    public boolean isScramble(String s1, String s2) {
        if(s1==null || s2==null || s1.length()!=s2.length()){
            return false;   
        }
        if(s1.length()==0){
            return true;   
        }
        int len=s1.length();
        boolean[][][] dp = new boolean[len][len][len+1];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                dp[i][j][1]=(s1.charAt(i)==s2.charAt(j));
            }
        }
        for(int com = 2;com<=len;com++){
            for(int i=0;i<len-com+1;i++){
                for(int j=0;j<len-com+1;j++){
                    for(int k=1;k<com;k++){
                        dp[i][j][com]|=(dp[i][j][k]&&dp[i+k][j+k][com-k])||(dp[i+k][j][com-k]&&dp[i][j+com-k][k]);
                    }
                }
            }
        }
        return dp[0][0][len];
    }
}
