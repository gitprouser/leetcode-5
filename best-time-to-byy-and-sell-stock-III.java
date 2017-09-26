class Solution {
    public int maxProfit(int[] prices) {

        if(prices==null||prices.length==0){
            return 0;
        }
        int[] leftProfit =new int[prices.length];
        int minleft=prices[0];
        int maxleftProfit = 0;
        
        for(int i=1;i<prices.length;i++){
            minleft=Math.min(prices[i],minleft);
            maxleftProfit=Math.max(maxleftProfit,prices[i]-minleft);
            leftProfit[i]=maxleftProfit;
        }
        int res= leftProfit[prices.length-1];
        int maxright=prices[prices.length-1],maxrightProfit=0;
        for(int i=prices.length-2;i>=0;i--){
            maxright=Math.max(maxright,prices[i]);
            maxrightProfit=Math.max(maxrightProfit,maxright-prices[i]);
            res=Math.max(res,leftProfit[i]+maxrightProfit);
        }
        return res;
    }
}
