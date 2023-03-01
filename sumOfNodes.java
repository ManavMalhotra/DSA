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
    public int sumNodes(TreeNode root) {
        
        if (root == null){
            return 0;
        }
        
        int leftNode = sumNodes(root.left);
        int rightNode = sumNodes(root.right);

        int maxHeight = Math.max(leftNode,  rightNode);

        return maxHeight + 1 ; 

        
    }
}