class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle == null || needle.length()==0){
            return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        int i=0;

        while(i<=haystack.length()-needle.length()){
            boolean sucess=true;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    sucess=false;
                    break;
                }
            }
            if(sucess==true){
                return i;
            }
            i++;
        }
        return -1;
    }
}
