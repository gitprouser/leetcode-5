class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
            }
        }
        int count=0;
        boolean isSame=true;
        for (int i=0;i<min;i++){
            for(int j=1;j<length;j++){
                if (strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    isSame=false;
                    break;
                }
            }
            if (isSame){
                count++;
            }else{
                break;
            }
        }
    if (count==0||length==0){
        return "";
    }else{
        return strs[0].substring(0,count);   
    }
    }
}
