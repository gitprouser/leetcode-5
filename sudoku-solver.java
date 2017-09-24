class Solution {
    public void solveSudoku(char[][] board) {
            helper(board);
    }
    
    public boolean helper(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    continue;
                }else{
                    for(int k=1;k<=9;k++){
                        board[i][j]=(char)(k+'0');
                        if(isValidSudoku(board)&&helper(board)){
                            return true;
                        }
                        board[i][j]='.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Boolean> nums = new HashMap<Character,Boolean>();
        for(int i=0;i<9;i++){
            nums.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(nums.containsKey(board[i][j])){
                    return false;
                }
                nums.put(board[i][j],true);
            }
        }
        for(int j=0;j<9;j++){
            nums.clear();
            for(int i=0;i<9;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(nums.containsKey(board[i][j])){
                    return false;
                }
                nums.put(board[i][j],true);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                nums.clear();
                for(int k=0;k<9;k++){
                    char temp = board[i+k/3][j+k%3];
                    if(temp=='.'){
                        continue;
                    }
                    if(nums.containsKey(temp)){
                        return false;
                    }
                    nums.put(temp,true);
                }
            }
        }
        return true;
    }
}
