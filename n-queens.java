class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>  res = new ArrayList<List<String>>();
        int[] columnofRow=new int[n];
        helper(n,0,columnofRow,res);
        return res;
    }
    
    public void helper(int n,int row,int[] columnofRow,List<List<String>>  res){
        if(n==row){
            List<String> item = new ArrayList<String>();
            for(int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    if(columnofRow[i]==j){
                        sb.append('Q');
                    }else{
                        sb.append('.');
                    }
                }
                item.add(sb.toString());
            }
            res.add(item);
            return;
        }else{
            for(int i=0;i<n;i++){
                columnofRow[row]=i;
                if(check(columnofRow,row)){
                    helper(n,row+1,columnofRow,res);
                }
            }
        }
    }
    public boolean check(int[] columnofRow,int row){
        for(int i=0;i<row;i++){
            if(columnofRow[row]==columnofRow[i]||Math.abs(columnofRow[i]-columnofRow[row])==Math.abs(i-row)){
                return false;
            }
        }
        return true;
    }
}
