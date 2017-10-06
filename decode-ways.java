class Solution {
    public int numDecodings(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'?0:1;
        for(int i=2;i<=s.length();i++){
            dp[i]=(s.charAt(i-1)=='0')?0:dp[i-1];
            int temp = isBig(s.charAt(i-2),s.charAt(i-1));
            if(temp>=10&&temp<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];    
    }
    
    public int isBig(char a,char b){
        return (a-'0')*10+(b-'0');
    }
}
