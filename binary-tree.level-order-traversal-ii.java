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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
                Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            res.add(temp);
        }
        return reverse(res);
    }
    public List<List<Integer>> reverse(List<List<Integer>> list){
        int start=0,end = list.size()-1;
        while(start<end){
            List<Integer> temp = list.get(end);
            list.set(end,list.get(start));
            list.set(start,temp);
            start++;
            end--;
        }
        return list;

    }
}
