/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();
    TreeNode next=null;
    public void Add2Stack(TreeNode root){
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }
    public BSTIterator(TreeNode root) {
        next = root; 
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       if(next!=null){
            Add2Stack(next);
            next=null;
       } 
       return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
       if(!hasNext()){
            return Integer.MIN_VALUE; 
       } 
       TreeNode cur = stack.pop();
       next = cur.right;
       return cur.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
