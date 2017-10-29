class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        list.add(1);
        for(int i=1;i<=rowIndex;i++){
            for(int j=i-1;j>=1;j--){
                list.set(j,list.get(j)+list.get(j-1));
            }
            list.add(1);
        }
        return list;
    }
}
