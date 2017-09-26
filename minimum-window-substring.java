class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        int left=0,right=0;
        int count=t.length();
        int mlen = Integer.MAX_VALUE;
        String res="";
        for(char c:t.toCharArray()){
            map[c]++;
        }
        char[] src=s.toCharArray();
        while(right<s.length()||count==0){
            if(count==0){
                if(right-left+1<mlen){
                    mlen = right-left+1;
                    res=s.substring(left,right);
                }
                if(map[src[left++]]++>=0){
                    count++;
                }
            }else{
                if(map[src[right++]]-->=1){
                    count--;
                }
            }
        }
        return res;
    }
}
