class Solution {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length+1];
        int carry=0;
        int[] temp;
        for(int i=digits.length-1;i>=0;i--){
            if(i==digits.length-1){
                res[i+1]=(digits[i]+1)%10+carry;    
                carry=(digits[i]+1)/10;
            }else{
                res[i+1]=(digits[i]+carry)%10;    
                carry=(digits[i]+carry)/10;    
            }
            
        }
        res[0]=carry;
        if(res[0]!=0){
            return res;
        }else{
            temp = new int[res.length-1];
            for(int i=0;i<temp.length;i++){
                temp[i]=res[i+1];
            }
        }
        return temp;
    }
}

