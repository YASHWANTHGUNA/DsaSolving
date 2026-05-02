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
      int dia = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        Find(root); 
        return dia; 
      
    
        

    }
    private int Find(TreeNode root) {
        if(root == null) return 0; 
        int lh = Find(root.left); 
        int rh = Find(root.right); 
        dia = Math.max(dia, lh+rh); 
        return 1 + Math.max(lh, rh); 
    }
}