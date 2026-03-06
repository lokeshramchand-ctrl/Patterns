package code.Tre;

import java.util.LinkedList;
import java.util.Queue;

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

public class operations {

    public TreeNode create() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");

    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

    }

    // public void levelOrder(TreeNode root)
    // {
    // if (root == null)
    // {
    // return;
    // }
    // Queue<TreeNode> queue = new LinkedList<>();
    // queue.add(root);
    // while (!queue.isEmpty())
    // {
    // TreeNode current = queue.poll();
    // System.out.print(current.val + " ");
    // if (current.left != null)
    // {
    // queue.add(current.left);
    // }
    // if (current.right != null)
    // {
    // queue.add(current.right);
    // }
    // }
    // }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

}
