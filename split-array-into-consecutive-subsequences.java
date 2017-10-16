class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Map<Integer,Integer> endmap = new HashMap<Integer,Integer>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)==0){
                continue;
            }else if(endmap.getOrDefault(i,0)>0){
                endmap.put(i,endmap.getOrDefault(i,0)-1);
                endmap.put(i+1,endmap.getOrDefault(i+1,0)+1);
            }else if(map.getOrDefault(i+1,0)>0&&map.getOrDefault(i+2,0)>0){
                map.put(i+1,map.getOrDefault(i+1,0)-1);
                map.put(i+2,map.getOrDefault(i+2,0)-1);
                endmap.put(i+3,endmap.getOrDefault(i+3,0)+1);
            }else{
                return false;
            }
            map.put(i,map.getOrDefault(i,0)-1);
        }
        return true;
    }
}
