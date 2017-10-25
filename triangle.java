class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null||triangle.size()==0){
            return 0;
        }
        if(triangle.size()==1) return triangle.get(0).get(0);  
        int len = triangle.size();
        int[] sum = new int[len];
        sum[0]=triangle.get(0).get(0);
        for(int i =1;i<len;i++){
            sum[i]=triangle.get(i).get(i)+sum[i-1];
            for(int j=i-1;j>=1;j--){
                sum[j]=(sum[j]<sum[j-1]?sum[j]:sum[j-1])+triangle.get(i).get(j);
            }
            sum[0]=triangle.get(i).get(0)+sum[0];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            min = Math.min(min,sum[i]);
        }
        return min;
    }
}
