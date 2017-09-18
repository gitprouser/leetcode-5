public String getPermutation(int n,int k){
    StringBuilder sn = new StringBuilder();
    boolean[] used = new boolean[n];
    k = k-1;
    int factor = 1;
    for (int i=1;i<n;i++){
        factor*=i;
    }
    for(int i=0;i<n;i++){
        index = factor/factor;
        for (int j=0;j<n;j++){
            if(used[j]==flase){
                if(index==0){
                    used[j]=true;
                    sb.append((char)('o'+j+1));
                    break;
                }else{
                    index--;
                }
            }
        }
        k=k%factor;
        if(i<n-1){
            factor = factor/(n-1-i);
        }
    }
    returnsb.toString();
}
