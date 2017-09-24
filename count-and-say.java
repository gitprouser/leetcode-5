class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s= "1";
        int count=1;
        int round=0;
        int i;
        StringBuilder ret = new StringBuilder();
        while(++round<n){
            ret.setLength(0);
            count=1;
            for(i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                }else{
                    ret.append(count).append(s.charAt(i-1));
                    count=1;
                }
            }
            ret.append(count).append(s.charAt(i-1));
            s=ret.toString();
        }
        return ret.toString();
    }
}
