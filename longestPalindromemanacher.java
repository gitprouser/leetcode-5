
public static String longestPalindrome(String s){
    for(int size= s.length();size>0;size--){
        for(int low = 0,hight=low+size-1;high<s.length();low++,high++){
            if (shrinkCheck(s,low,high)){
                return s.substring(low,high+1);
            }
        }
    }
}
public boolean shrinkCheck(String s ,int low,int high){
    while(low<=high){
        if(s.charAt(low)==s.charAt(high)){
            low++;high--
        }else{
            return false;
        }
    }
   return true;
}


