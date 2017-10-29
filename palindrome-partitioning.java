class Solution {
    public List<List<String>> partition(String s) {
        int size = s.length();
        boolean[][] dp = new boolean[size][size];
        for(int i=size-1;i>=0;i--){
            for(int j=i;j<size;j++){
                dp[i][j]=(s.charAt(i)==s.charAt(j)&&(j-i<=2||dp[i+1][j-1]));
            }
        }
        List<List<String>> res = new ArrayList();
        List<String> temp = new ArrayList();
        findPartition(dp,res,temp,s,0);
        return res;
    }
    public void findPartition(boolean[][] dp,List<List<String>> res,List<String> temp,String s,int start){
        if (start == s.length()) {
            res.add(new ArrayList<String>(temp));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (dp[start][i]) {
                temp.add(s.substring(start, i+1));
                findPartition(dp, res, temp, s, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
