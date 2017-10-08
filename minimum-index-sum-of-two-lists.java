class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int res=Integer.MAX_VALUE;
        List<String> all = new ArrayList<String>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int temp = i+map.get(list2[i]);
                if(temp-res<0){
                    res=temp;
                    all.clear();
                    all.add(list2[i]);
                }else if(temp==res){
                    all.add(list2[i]);
                }
            }
        }
        String[] result = new String[all.size()];
        for(int i=0;i<all.size();i++){
            result[i] = all.get(i);
        }
        return result;
    }
}
