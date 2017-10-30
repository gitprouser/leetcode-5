class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> cstack = new Stack<>();
        int i=0;
        String res="";
        while(i<s.length()){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int count=0;
                while(Character.isDigit(s.charAt(i))){
                    count=10*count+(s.charAt(i)-'0');
                    i++;
                }
                cstack.push(count);
            }else if(ch=='['){
                stack.push(res);
                res="";
                i++;
            }else if(ch==']'){
                StringBuilder temp = new StringBuilder(stack.pop());
                int c = cstack.pop();
                for(int j=0;j<c;j++){
                    temp.append(res);
                }
                res=temp.toString();
                i++;
            }else{
                res+=ch;
                i++;
            }
        }
        return res;
    }
}

