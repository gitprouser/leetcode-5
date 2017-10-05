class Solution {
    public int mySqrt(int x) {
        double res=1.0;
        
        for(int i=0;i<20;i++){
            res=(res+x/res)/2;
        }
        return (int)res;
    }
}
