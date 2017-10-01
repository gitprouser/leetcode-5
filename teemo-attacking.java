class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res=0;
        int oldend=-1, newend=0;
        for(int i=0;i<timeSeries.length;i++){
            newend = timeSeries[i]+duration-1;
            if(newend>oldend){
                res+=Math.min(duration,newend-oldend);
                oldend=newend;
            }
        }
        return res;
    }
}
