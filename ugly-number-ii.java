class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> dp = new ArrayList<Integer>();
        dp.add(1);
        int p2=0,p3=0,p5=0;
        for(int i=1;i<n;i++){
            int last = dp.get(i-1);
            while(dp.get(p2)*2<=last) p2++;
            while(dp.get(p3)*3<=last) p3++;
            while(dp.get(p5)*5<=last) p5++;
            dp.add(Math.min(Math.min(dp.get(p2)*2,dp.get(p3)*3),dp.get(p5)*5));
        }
        return dp.get(n-1);
    }
}
