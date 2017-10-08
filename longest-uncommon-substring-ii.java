class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        for(int i=0;i<strs.length;i++){
            int notMatch = strs.length-1;
            for(int j=0;j<strs.length;j++){
                if(i!=j&&isSubString(strs[i],strs[j])){
                    notMatch--;
                }
                if(notMatch==0){
                    return strs[i].length();
                }
            }
        }
        return -1;
    }
    public boolean isSubString(String s1,String s2){
        int i = 0;  
        for (char ch: s2.toCharArray()) {  
            if (i < s1.length() && s1.charAt(i) == ch) {  
                i ++;  
            }  
        }  
        if (i == s1.length()) {  
            return false;  
        }  
        return true;  
    }
}
