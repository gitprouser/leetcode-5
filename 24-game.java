class Solution {
    boolean res= false;
    final double eps = 0.001;
    public boolean judgePoint24(int[] nums) {
        List<Double> arr = new ArrayList<Double>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]*1.0);
        }
        helper(arr);
        return res;
    }
    public void helper(List<Double> arr){
        if(res==true){
            return;
        }
        if(arr.size()==1){
            if(Math.abs(arr.get(0) - 24.0) < eps){
                res=true;
            }
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<i;j++){
                List<Double> candi = new ArrayList<Double>();
                Double ti=arr.get(i),tj=arr.get(j);
                candi.addAll(Arrays.asList(ti+tj,ti-tj,tj-ti,ti*tj));
                if(Math.abs(ti)>eps){
                    candi.add(tj/ti);
                }
                if(Math.abs(tj)>eps){
                    candi.add(ti/tj);
                }
                arr.remove(i);
                arr.remove(j);
                for(Double can:candi){
                    arr.add(can);
                    helper(arr);
                    arr.remove(arr.size()-1);
                }
                arr.add(j,tj);
                arr.add(i,ti);
            }
        }
    }
}
