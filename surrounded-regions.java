class Solution {
    public void solve(char[][] board) {
        if(board==null||board.length==0){
            return;
        }
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                fill(board,i,0);
            }
            if(board[i][n-1]=='O'){
                fill(board,i,n-1);
            }
        }
        for(int j=1;j<n-1;j++){
            if(board[0][j]=='O'){
                fill(board,0,j);
            }
            if(board[m-1][j]=='O'){
                fill(board,m-1,j);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 if(board[i][j]=='O'){
                     board[i][j]='X';
                 }
                 if(board[i][j]=='Y'){
                     board[i][j]='O';
                 }
            }
        }
        return ;
    }
    public void fill(char[][] board,int i,int j){
        int m = board.length;
        int n = board[0].length;
        if(i>=0&&i<m&&j>=0&&j<n){
            if(board[i][j]=='O'){
                board[i][j]='Y';
                fill(board,i+1,j);
                fill(board,i-1,j);
                fill(board,i,j+1);
                fill(board,i,j-1);
            }   
        }
    }
}
