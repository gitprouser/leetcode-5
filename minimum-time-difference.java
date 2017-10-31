class Solution {
    public int findMinDifference(List<String> timePoints) {
        HashSet<String> times = new HashSet<String>(timePoints);
         if(times.size()<timePoints.size())  
            return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<timePoints.size();i++){
            for(int j=i+1;j<timePoints.size();j++){
                int temp = twoDiff(timePoints.get(i),timePoints.get(j));
                res=Math.min(res,temp);
            }
        }
        return res;
    }
    
    public int twoDiff(String a,String b){
        String[] as = a.split("\\:");  
        String[] bs = b.split("\\:");  
        int ta =Integer.valueOf(as[0])*60+Integer.valueOf(as[1]);
        int tb =Integer.valueOf(bs[0])*60+Integer.valueOf(bs[1]);
        int res = (tb-ta+1440)%1440;
        return Math.min(res,1440-res);
    }
    
}
