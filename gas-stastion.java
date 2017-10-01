class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0,nextGas=0,curGas=0;
        for(int i=0;i<gas.length;i++){
            nextGas+=gas[i]-cost[i];
            curGas+=gas[i]-cost[i];
            if(curGas<0){
                curGas=0;
                start=i+1;
            }
        }
        if(nextGas<0) return -1;
        return start;
    }
}
