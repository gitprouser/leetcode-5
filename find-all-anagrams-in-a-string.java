class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        if(s == null || p == null) return res;
        int left=0,right=0,count=p.length();
        char[] src = s.toCharArray();
        int[] map = new int[256];
        for(char c:p.toCharArray()){
            map[c]++;
        }
        
        while(right<s.length()){
            if(map[src[right++]]-->=1){
                count--;
            }
            if(count==0){
                res.add(left);
            }
            if(right-left==p.length()&&map[src[left++]]++>=0){
                count++;
            }
        }
        return res;
    }
}
