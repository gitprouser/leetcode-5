class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<input.length();i++){
            char temp = input.charAt(i);
            if(isOperator(temp)){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(int num1:left){
                    for(int num2:right){
                        res.add(cal(num1,num2,temp));
                    }
                }
            }
        }
        if(res.size()==0){
            res.add(Integer.valueOf(input));
        }
        return res;
    }
    public int cal(int a,int b,char operator){
        switch(operator){
            case '+':return a+b;
            case '-':return a-b;
            case '*':return a*b;    
        }
        return 0;
    }
    public boolean isOperator(char ch){
        return ch=='+'||ch=='-'||ch=='*';
    }
}
