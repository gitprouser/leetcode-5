class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i=s.length()-1;i>=0;i--){
            char temp = s.charAt(i);
            if(len==0){
                if(temp==' '){
                    continue;
                }else{
                    len++;
                }
            }else{
                if(temp==' '){
                    break;
                }else{
                    len++;
                }
            }
        }
        return len;
    }
}
