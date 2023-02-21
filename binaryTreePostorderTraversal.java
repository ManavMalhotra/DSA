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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>(); // Created Array List 
        postorder(root, result); // Call Static Inorder function
        
        return result;
    }
        public static void postorder(TreeNode node, List<Integer> result) {
            
            // Check If our right or left node is null
            if (node == null) {
                return;
            }
            
            postorder(node.left, result); // Get left Node recursively
            postorder(node.right, result); // // Get Right Node recursively
            result.add(node.val); // Add that Node in our arrayList
        }

}