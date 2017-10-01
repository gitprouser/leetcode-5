class Solution {
    public boolean isPowerOfThree(int n) {
        // while (n !=0 && n % 3 == 0) {
        //     n /= 3;
        // }
        // return n == 1;
        // return (n > 0 && 1162261467 % n == 0);
        return (n > 0 && int(log10(n) / log10(3)) - log10(n) / log10(3) == 0);
    }
}
