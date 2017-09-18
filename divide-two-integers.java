class Solution {
    public int divide(int dividend, int divisor) {
        boolean singed=true;

        if (divisor == 0) {
            return dividend >= 0? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        if (dividend == 0) {
            return 0;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if(dividend<0){
            singed=!singed;
            dividend=-dividend;
        }
        if(divisor<0){
            singed=!singed;
            divisor=-divisor;
        }
        long a = Math.abs((long)dividend);        
        long b = Math.abs((long)divisor);        
        int result=0;
        while(a>=b){
            int shift=0;
            while(a>=(b<<shift)){
                shift++;
            }
            a-=b<<(shift-1);
            result+=1<<(shift-1);
        }
        if(singed){
            return result;
        }else{
            return -result;
        }
    }
}
