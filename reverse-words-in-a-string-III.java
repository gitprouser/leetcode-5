class Solution {
    public String reverseWords(String s) {
        char[] ans = s.toCharArray();
        int len = s.length();
        int start=0;
        for(int i=0;i<len;i++){
            if(ans[i]==' '){
                reverse(ans,start,i);
                start=i+1;
            }
        }
        reverse(ans,start,len);
        return String.valueOf(ans);
    }
    public void reverse(char[] chars, int start, int end){
        for (int i = start; i < (start + end) / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[end - 1 - i + start];
            chars[end - 1 - i + start] = temp;
        }
    }
}
