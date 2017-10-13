class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        // for(int i=0;i<1<<n;i++){
        //     res.add((i>>1)^i);
        // }
        // return res;
        
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        for(int i = 0; i < n; i++){
            int highestBit = 1 << i;
            int size = res.size();
            for(int j = size - 1; j >= 0; j--){
                int num = res.get(j);
                num += highestBit;
                res.add(num);
            }
        }
        return res;
    }
}
