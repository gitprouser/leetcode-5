class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        char temp='#';
        for(int i=0;i<s.length();i++){
            temp= s.charAt(i);
            if(temp=='A'){
                countA++;
                countL=0;
                if(countA>=2){
                    return false;
                }
            }else if(temp=='L'){
                countL++;
                if(countL>=3){
                    return false;
                }
            }else{
                countL=0;
            }
        }
        return true;
    }
}
