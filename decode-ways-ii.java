class Solution {
    public int numDecodings(String s) {
        if(s==null||s.length()==0){
            return 0;            
        }
         final int mod = 1000000007;
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        for(int i=1;i<=s.length();i++){
            dp[i]=0;
            if(s.charAt(i-1)=='*'){
                dp[i] = (int)((dp[i]+9L*dp[i-1])%mod);
                if(i>=2){
                    if(s.charAt(i-2)=='*'){
                        dp[i]=(int)((dp[i]+dp[i-2]*15L)%mod);
                    }else if(s.charAt(i-2)=='1'){
                        dp[i]=(int)((dp[i]+dp[i-2]*9L)%mod);
                    }else if(s.charAt(i-2)=='2'){
                        dp[i]=(int)((dp[i]+dp[i-2]*6L)%mod);
                    }
                }
            }else{
                if (s.charAt(i - 1) != '0') {
                    dp[i]=(dp[i]+dp[i-1])%mod;
                }
                if(i>=2){
                    if (s.charAt(i-2)=='*') {
                        if (s.charAt(i - 1) <= '6') {
                            dp[i]=(int)((dp[i]+2L*dp[i-2])%mod);
                        }else{
                            dp[i]=(dp[i]+dp[i-2])%mod;
                        }
                    }else{
                        int temp = isBig(s.charAt(i-2),s.charAt(i-1));
                        if(temp>=10&&temp<=26){
                            dp[i]=(dp[i]+dp[i-2])%mod;
                        }
                    }
                }
            }
        }
        return dp[s.length()];
    }

    public int isBig(char a,char b){
        return (a-'0')*10+(b-'0');
    }
}
