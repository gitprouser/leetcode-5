class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j = s.length()-1;
        char[] res = s.toCharArray();
        while(i<j){
            if(isVowels(res[i])&&isVowels(res[j])){
                char temp = res[i];
                res[i] = res[j];
                res[j] = temp;
                i++;
                j--;
            }else if(isVowels(res[i])&&!isVowels(res[j])){
                j--;
            }else if(!isVowels(res[i])&&isVowels(res[j])){
                i++;
            }else {
                i++;
                j--;
            }
        }
        return new String(res);
    }
    
    public boolean isVowels(char a){
        char[] vo={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<vo.length;i++){
            if (a==vo[i]){
                return true;
            }
        }
        return false;
    }
}
