public class Solution{
    List<String> res;
    public List<String> letterCombinations(String digits){
        String[] table ={" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
       StringBuilder temp =new StringBuilder();
       res = new LinkedList<String>();
       dfs(table,0,temp,digits);
       return res;
    }
    public void dfs(String[] table,int idx,StringBuilder temp,String digits){
        if (idx==digits.length()){
            if(temp.length()!=0){
                res.add(temp.toString());
            }
        }else{
            String candidates = table[digits.charAt(idx)-'0'];
            for(int i=0;i<candidates.length();i++){
                temp.append(candidates.charAt(i));
                dfs(table,idx+1,temp,digits);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}
