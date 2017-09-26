class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean res = false;
        if(s2.length()<s1.length()){
            return res;
        }
        int[] map = new int[256];
        for(char c:s1.toCharArray()){
            map[c]++;
        }
        int left=0,right=0;
        int count=s1.length();
        char[] src=s2.toCharArray();
        while(right<s2.length()){
            if(map[src[right++]]-->=1) count--;
            if(count==0){
                res=true;
                break;
            }
            if(right-left==s1.length()&&map[src[left++]]++>=0){
                count++;
            }
        }
        return res;
    }
}
