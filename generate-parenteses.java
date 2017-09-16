class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<String>();
        dfs("",0,0,n);
        return res;
    }
    
    public void dfs(String sb,int left,int right,int n){
        if (left == n && right == n) {
            res.add(sb);
        } else if (left <= n && right <= n) {
            if (left == right) {
                dfs(sb + '(', left + 1, right, n);
                dfs(sb + ')', left, right + 1, n);
            } else if (left > right) {
                dfs(sb + '(', left + 1, right, n);
                dfs(sb + ')', left, right + 1, n);
            } else if (left < right) {
                return;
            }
        }
    }
}
