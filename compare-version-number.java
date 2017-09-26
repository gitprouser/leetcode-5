class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        int lena=version1.length();
        int lenb=version2.length();
        int tempa,tempb;
        while(i<lena||j<lenb){
            tempa=0;
            tempb=0;
            while(i<lena&&version1.charAt(i)!='.'){
                tempa=tempa*10+(version1.charAt(i)-'0');
                i++;
            }
            i++;
            while(j<lenb&&version2.charAt(j)!='.'){
                tempb=tempb*10+(version2.charAt(j)-'0');
                j++;
            }
            j++;
            if(tempa>tempb){
                return 1;
            }else if(tempa<tempb){
                return -1;
            }
        }
        return 0;
    }
}
