class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return (isValid(s,l,r-1)||isValid(s,l+1,r));
            }else{
                l++;r--;
            }
        }
        return true;
    }
    
    public boolean isValid(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l++;r--;
            }
        }
        return true;
    }
}
