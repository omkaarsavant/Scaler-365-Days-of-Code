/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
class Solution {
    int result = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode A) {
        maxPathDown(A);
        return result;
    }
    
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        result = Math.max(result, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
