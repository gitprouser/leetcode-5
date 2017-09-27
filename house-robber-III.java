public int rob(TreeNode root){
    int[] num=dfs(root);
    return Math.max(num[0],num[1]);
}

public int[] dfs(TreeNode root){
    if(root==null) return new int[2];
    int[] left = dfs(root.left);
    int[] right = dfs(root.right);
    int[] res = new int[2];
    res[0]=left[1]+right[1]+x.val;
    res[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
    return res;
}
