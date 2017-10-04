class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];
        sell[0]=0;
        buy[0]=-prices[0];
        for(int i=1;i<n;i++){
            sell[i]=Math.max(sell[i-1],buy[i-1]+prices[i]);
            buy[i]=Math.max(buy[i-1],(i>1?sell[i-2]:0)-prices[i]);
        }
        return sell[n-1];
    }
}
