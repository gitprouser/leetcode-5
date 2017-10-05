class Solution {
    public boolean judgeSquareSum(int c) {
        int a=0,b=mySqrt(c);
        while(a<=b){
            if(a*a+b*b==c) return true;
            else if(a*a+b*b<c) a++;
            else --b;
        }
        return false;
    }

    public int mySqrt(int x) {
        double res=1.0;
        for(int i=0;i<20;i++){
            res=(res+x/res)/2;
        }
        return (int)res;
    }

}
