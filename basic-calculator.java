class Solution {
    public int calculate(String s) {
        s = s.replace(" ","");
        Stack<Integer> sta = new Stack<Integer>();
        sta.push(1);
        int i=0,res=0,sign=1;
        while(i<s.length()){
            char cur = s.charAt(i);
            switch(cur){
                case '+':
                    sign=1;
                    i++;
                    break;
                case '-':
                    sign=-1;
                    i++;
                    break;
                case '(':
                    sta.push(sta.peek()*sign);
                    sign=1;
                    i++;
                    break;
                case ')':
                    sta.pop();
                    i++;
                default:
                    int num=0;
                    while(i < s.length() && Character.isDigit(s.charAt(i))){
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    res += num * sign * sta.peek();
                    break;
            }
        }
        return res;
    }
}
