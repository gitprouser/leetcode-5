class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int[] next = new int[len];
        next[0]=-1;
        int i,j=-1;
        for(i=1;i<len;i++){
           while(j>=0&&s.charAt(i)!=s.charAt(j+1)){
                j = next[j];
           }
           if(s.charAt(i)==s.charAt(j+1)){
                j++;
           }
           next[i]=j;
        }
        int lenSub = len-1-next[len-1];
        return lenSub!=len&&len%lenSub==0;
    }
}
