class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack();
        for(int i=0;i<tokens.length;i++){
            if(isOp(tokens[i])){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(cal(tokens[i],b,a)+"");
            }else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.pop());
    }
    public int cal(String op,int a,int b){
        switch(op){
            case "+":return a+b;
            case "-":return a-b;
            case "*":return a*b;
            case "/":return a/b;
            default:return 0;
        }
    }
    public boolean isOp(String s){
        return s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/");
    }
}
