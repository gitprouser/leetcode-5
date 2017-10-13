class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        helper(s,res,"",0);
        return res;
    }
    
    public void helper(String s,List<String> res,String out,int count){
        if(count==4){
            if(s.isEmpty()){
                res.add(out);
            }
            return ;
        }
        for(int i=1;i<4;i++){
            if(s.length()<i) {
                break;
            }
            int val = Integer.parseInt(s.substring(0,i));
            if(val>255||i!=String.valueOf(val).length()){
                continue;
            }
            helper(s.substring(i),res,out+s.substring(0,i)+(count==3?"":"."),count+1);
        }
    }
}
