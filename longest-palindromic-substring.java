class Solution {
    
    public String longestPalindrome(String s){
        if(s==null||s==""){
            return s;
        }
        int size =s.length();
        boolean[][] dp = new boolean[size][size];
        String res="";
        int max=0;
        for(int i=size-1;i>=0;i--){
            for(int j=i;j<size;j++){
                if(s.charAt(i)==s.charAt(j)&&(j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    if(max<j-i+1){
                        max=j-i+1;   
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
        // for(int size= s.length();size>0;size--){
        //     for(int low = 0,high=low+size-1;high<s.length();low++,high++){
        //         if (shrinkCheck(s,low,high)){
        //             return s.substring(low,high+1);
        //         }
        //     }
        // }
        // return s.substring(0,1);
    }
    public boolean shrinkCheck(String s ,int low,int high){
        while(low<=high){
            if(s.charAt(low)==s.charAt(high)){
                low++;high--;
            }else{
                return false;
            }
        }
        return true;
    }
}
