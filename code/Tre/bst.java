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

public class bst {
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public boolean search(TreeNode root , int val)
    {
        if(root == null)
        {
            return false;
        }
        else if (root.val == val)
        {
            return true;
        }
        else if (root.val > val)
        {
            return search(root.left , val);
        }
        else 
        {
            return search(root.right, val);
        }
    }
}
