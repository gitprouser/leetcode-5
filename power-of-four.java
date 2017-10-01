class Solution {
    public boolean isPowerOfFour(int num) {
        double res = Math.log10(num)/Math.log10(4);
        
        return (num>0&&(int)res-res==0);   
    }
}
