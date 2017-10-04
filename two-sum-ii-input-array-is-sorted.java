class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int[] res = new int[2];
        int temp=0;
        while(i<j){
            temp = numbers[i]+numbers[j];
            if(temp==target){
                res[0]=i+1;
                res[1]=j+1;
                return res;
            }else if(temp>target){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }
}
