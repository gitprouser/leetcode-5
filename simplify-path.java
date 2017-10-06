class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/+");
        List<String> res = new ArrayList<String>();
        for(int i=1;i<split.length;i++){
            if(split[i].equals(".")){
                continue;
            }else if(split[i].equals("..")){
                if(res.size()!=0){
                    res.remove(res.size()-1);
                }
            }else{
                res.add(split[i]);
            }
        }
        String fianl="/";
        for(int i=0;i<res.size();i++){
            if(i==res.size()-1){
                fianl+=res.get(i);    
            }else if(res.get(i).equals("")){
                continue;
            }else{
                fianl+=res.get(i)+"/";
            }
        }
        return fianl;
    }
}
