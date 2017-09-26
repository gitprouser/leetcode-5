class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        int res=10;
        for(int i=1;i<n;i++){
            res+=f(i+1);
        }
        return res;
    }
    
    public int f(int k){
        int res=9;
        for(int i=1;i<k&&i<=9;i++){
            res*=(9-i+1);
        }
        return res;
    }
}
