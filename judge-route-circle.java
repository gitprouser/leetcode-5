class Solution {
    public boolean judgeCircle(String moves) {
        int res=0;
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'U':res+=1; break;
                case 'D':res-=1; break;
                case 'L':res+=2; break;
                case 'R':res-=2; break;
                default:return false;
            }
        }
        return res==0;
    }
}
