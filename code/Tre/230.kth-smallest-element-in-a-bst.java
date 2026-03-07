package code.Tre;
/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

// @lc code=start
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
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[1];
        int[] result = new int[1];
        inorder(root , k , count , result);
        return result[0];
    }
    private void inorder(TreeNode root , int k , int[] count , int[] result)
    {
        if(root == null|| count[0] >= k)
        {
            return;
        }
        inorder(root.left , k , count , result);
        count[0]++;
        if(count[0] == k)
        {
            result[0] = root.val;
            return;
        }
        inorder(root.right , k , count , result);

    }

}
// @lc code=end

