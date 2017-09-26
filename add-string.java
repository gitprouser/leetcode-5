class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0){
            int a = i>=0?num1.charAt(i--)-'0':0;
            int b = j>=0?num2.charAt(j--)-'0':0;
            int sum=carry+a+b;
            sb.insert(0,(char)(sum%10+'0'));
            carry=sum/10;
        }
        return carry==1?sb.insert(0,'1').toString():sb.toString();
    }
}
