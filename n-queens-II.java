class Solution {
    public int res = 0;
    public int totalNQueens(int n) {
        helper(n,0,new int[n]);
        return res;
    }
    public void helper(int n,int row,int[] coloumnofRow){
        if(n==row){
            res+=1;
            return;
        }else{
            for(int i=0;i<n;i++){
                coloumnofRow[row]=i;
                if(check(coloumnofRow,row)){
                    helper(n,row+1,coloumnofRow);    
                }                
            }
        }
    }
    public boolean check(int[] coloumnofRow,int row){
        for(int i=0;i<row;i++){
            if(coloumnofRow[row]==coloumnofRow[i]||Math.abs(coloumnofRow[row]-coloumnofRow[i])==Math.abs(row-i)){
                return false;
            }
        }
        return true;
    }
}
