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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        Map<String,Integer> map = new HashMap<String,Integer>();
        helper(root,res,map);
        return res;
    }
    public String helper(TreeNode root,List<TreeNode> res,Map<String,Integer> map){
        if(root==null){
            return "#";
        }
        String str = root.val+","+helper(root.left,res,map)+","+helper(root.right,res,map);
        if(map.getOrDefault(str,0)==1){
            res.add(root);
        }
        map.put(str,map.getOrDefault(str,0)+1);
        return str;
    }
}
