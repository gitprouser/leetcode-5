class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        int pow2=1,before=1;
        for(int i=1;i<=num;i++){
            if(i==pow2){
                before=res[i]=1;
                pow2<<=1;
            }else{
                res[i]=res[before]+1;
                before+=1;
            }
        }
        return res;
    }
}
