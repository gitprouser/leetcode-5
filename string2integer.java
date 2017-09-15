class Solution {
    public int myAtoi(String str) {
        if(str==null||str.isEmpty()){
            return 0;
        }
        int index=0;
        int sign =1;
        str = str.trim();
        if(str.charAt(index)=='+'){
            index++;
        }else if(str.charAt(index)=='-'){
            index++;
            sign=-1;
        }
        long num=0;
        for (;index<str.length();index++){
                if(str.charAt(index)>'9'||str.charAt(index)<'0'){
                    break;
                }else{
                    num=num*10+(str.charAt(index)-'0');
                    if (num>Integer.MAX_VALUE){
                        break;
                    }
                }
        }
        if (num * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (num * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)num * sign;
    }
}
