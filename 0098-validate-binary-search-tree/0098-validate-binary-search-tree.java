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
    public boolean isValidBST(TreeNode root) {
        LinkedList<Integer> inorderList = new LinkedList<>();
        helper(root,inorderList);

        boolean bst = true;
        int prev = inorderList.get(0);
        for(int i=1;i<inorderList.size();i++){
            if(inorderList.get(i)<=prev){
                bst=false;
                return bst;
            }

            prev=inorderList.get(i);
        }
        return bst;

    }

    public void helper(TreeNode root, List<Integer> inorderList){
        if(root == null) return;

        helper(root.left,inorderList);
        inorderList.add(root.val);
        helper(root.right,inorderList);
    }
}