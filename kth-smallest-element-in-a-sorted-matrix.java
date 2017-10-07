class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int L = matrix[0][0], R = matrix[n-1][n-1];
        while(L<R){
            int mid = L+(R-L)/2;
            int temp=0;
            for(int i=0;i<n;i++){
                temp+=binary_search(matrix[i],n,mid);
            }
            if(temp<k){
                L=mid+1;
            }else{
                R=mid;
            }
        }
        return L;
    }
    public int binary_search(int[] row,int R,int x){
        int L=0;
        while(L<R){
            int mid = (L+R)/2;
            if(row[mid]<=x){
                L=mid+1;        
            }else{
                R=mid;
            }
        }
        return L;
    }
}
