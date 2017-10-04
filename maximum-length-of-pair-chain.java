class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs==null||pairs.length==0){
            return 0;
        }
        Arrays.sort(pairs,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int res = 1;
        int max;
        max= pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>max){
                max=pairs[i][1];
                res++;
            }
        }
        return res;
    }
}
