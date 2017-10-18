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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> res = new ArrayList<Double>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            double sum = 0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                // temp.add(node.val);
                sum+=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            res.add(sum/n);
        }
        return res;

    }
}
