class Solution {
    
    public String validIPAddress(String IP) {
        String[] v4 = IP.split("\\.");
        String[] v6 = IP.split(":");
        boolean isV4=true;
        boolean isV6=true;
        if(v4.length!=4&&v6.length!=8){
            return "Neither";
        }
        char end = IP.charAt(IP.length()-1);
        if(end==':'||end=='.'){
            return "Neither";
        }
        if(v4.length==4){
            isV6=false;
            for(int i=0;i<4;i++){
                if(!validV4(v4[i])){
                    isV4=false;
                }
            }
        }
        if(v6.length==8){
            isV4=false;
            for(int i=0;i<8;i++){
                if(!validV6(v6[i])){
                    isV6= false;
                }
            }
        }
        if(isV6){
            return "IPv6";
        }
        if(isV4){
            return "IPv4";
        }
            return "Neither";
    }
    
    public boolean validV4(String s){
        int ip = 0;
        if(s==null||s.length()==0||s.length()>3){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(i==0&&s.charAt(0)=='0'&&s.length()!=1){
                return false;
            }
            ip=(s.charAt(i)-'0')+ip*(i==0?1:10);
        }
        return ip<256&&ip>=0;
    }
    
    public boolean validV6(String s){
        boolean last = false;
        if(s==null||s.length()==0||s.length()>4){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!validHexadecimal(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean validHexadecimal(char a){
        return ((a>='0'&&a<='9')||(a>='a'&&a<='f')||(a>='A'&&a<='F'));
    }
}
