/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode res = new TreeNode(v);
            res.left=root;
            return res;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0i<size;i++){
                TreeNode temp =q.remove(); 
                if(level==d-1){
                    TreeNode left = new TreeNode(v);    
                    TreeNode right= new TreeNode(v);    
                    left.left = temp.left;
                    right.right= temp.right;
                    temp.left = left;
                    temp.right = right;

                }else{
                    if(temp.left!=null){
                        q.add(temp.left);
                    } 
                    if(temp.right!=null){
                        q.add(temp.right);
                    } 
                }
            }
            level+=1;
        }
        return root;
    }
}
