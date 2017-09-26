class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int mprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            mprice=Math.min(mprice,prices[i]);
            maxprofit =Math.max(maxprofit, prices[i]-mprice);
        }
        return maxprofit;
    }
}
