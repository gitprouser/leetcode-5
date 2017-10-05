class Solution {
    public boolean isPerfectSquare(int num) {
        double res=1.0;
        for(int i=0;i<20;i++){
            res=(res+num/res)/2;
        }
        return (res-(int)res)==0.0;
    }
}
