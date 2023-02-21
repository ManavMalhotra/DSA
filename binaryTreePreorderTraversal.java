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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>(); // Created Array List 
        preorder(root, result); // Call Static Inorder function
        
        return result;
    }
        public static void preorder(TreeNode node, List<Integer> result) {
            
            // Check If our right or left node is null
            if (node == null) {
                return;
            }
            
            result.add(node.val); // Add that Node in our arrayList
            preorder(node.left, result); // Get left Node recursively
            preorder(node.right, result); // // Get Right Node recursively
        }

}