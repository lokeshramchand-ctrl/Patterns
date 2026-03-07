package code.Tre;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class kth_largest {
    public int kthLargest(TreeNode root, int k) {
        int[] count = new int[1];
        int[] result = new int[1];
        reverseInorder(root, k, count, result);
        return result[0];
    }

    private void reverseInorder(TreeNode root, int k, int[] count, int[] result) {
        if (root == null || count[0] >= k) {
            return;
        }
        reverseInorder(root.right, k, count, result);
        count[0]++;
        if (count[0] == k) {
            result[0] = root.val;
            return;
        }
        reverseInorder(root.left, k, count, result);
    }

}