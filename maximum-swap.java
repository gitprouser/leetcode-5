class Solution {
    public int maximumSwap(int num) {
        String snum = num+"";
        char[] nums=snum.toCharArray();

        int len = snum.length();
        int[] back = new int[len];
        back[len-1]=nums[len-1]-'0';
        for(int i=len-2;i>=0;i--){
            back[i] = Math.max(back[i+1],nums[i]-'0');
        }
        for(int i=0;i<len;i++){
            if(back[i]==nums[i]-'0'){
                continue;
            }else{
                for(int j=len-1;j>i;j--){
                    if(nums[j]-'0'==back[i]){
                        char temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        String s= String.valueOf(nums);
                        return Integer.parseInt(s);
                    }
                }
            }
        }
        String s= String.valueOf(nums);
        return Integer.parseInt(s);
    }
}
