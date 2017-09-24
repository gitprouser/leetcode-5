class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> parent = new Stack<Integer>();
        int start=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur=='('){
                parent.push(i);
            }else{
                if(parent.empty()){
                    start=i+1;
                }else{
                    parent.pop();
                    if(parent.empty()){
                        maxlen = Math.max(maxlen,i-start+1);    
                    }else{
                        maxlen = Math.max(maxlen,i-parent.peek());
                    }
                    
                }
            }
        }
        return maxlen;
    }
}
