/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null ){
            return true;
        }
        Queue<TreeNode> leftqueue = new LinkedList<>();
        Queue<TreeNode> rightqueue = new LinkedList<>();

        leftqueue.add(root.left);
        rightqueue.add(root.right);

        while(!leftqueue.isEmpty() && !rightqueue.isEmpty()){

            TreeNode left = leftqueue.poll();
            TreeNode right = rightqueue.poll();

            if(left == null &&  right ==null) continue;
            if(left == null || right == null ) return false;
            if(left.val != right.val ) return false;

            leftqueue.add(left.left);
            leftqueue.add(left.right);

            rightqueue.add(right.right);
            rightqueue.add(right.left);        
        }
        return true;
    }
}