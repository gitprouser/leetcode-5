class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<String>();
        dfs(list,num,"",target,0,0,0);
        return list;
    }

    public void dfs(List<String> list,String num,String path,int target,int pos,long sum,long lastsum){
        int len = num.length();
        if(pos==len&&sum==target){
            list.add(path);
            return ;
        }
        if(pos>=len){
            return;
        }
        for(int i=pos;i<len;i++){
            if(i!=pos&&num.charAt(pos)=='0'){
                break;
            }
            long curNum = Long.parseLong(num.substring(pos,i+1));
            if(pos==0){
                dfs(list,num,path+""+curNum,target,i+1,curNum,curNum);
            }else{
                dfs(list,num,path+"+"+curNum,target,i+1,sum+curNum,curNum);
                dfs(list,num,path+"-"+curNum,target,i+1,sum-curNum,-curNum);
                dfs(list,num,path+"*"+curNum,target,i+1,sum-lastsum+lastsum*curNum,lastsum*curNum);
            }
        }
    }
}
