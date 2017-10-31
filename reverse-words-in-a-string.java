public class Solution {
    public String reverseWords(String s) {
        String[] temp =s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=temp.length-1;i>=0;i--){
            if(temp[i].equals("")) continue;
            res.append(temp[i]+(i==0?"":" "));
        }
        return res.toString().trim();
    }
}
