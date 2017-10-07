class Solution {
    public boolean detectCapitalUse(String word) {
        boolean s=false;
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(isCap(word.charAt(i))){
                count++;
                if(i==0){
                    s=true;    
                }
            }
        }
        if(count==word.length()){
            return true;
        }else if(s&&count==1){
            return true;
        }else if(count==0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isCap(char s){
        boolean res = s-'A'>=0&&s-'Z'<=0;
        return res;
    }
}
