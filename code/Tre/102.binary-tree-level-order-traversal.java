/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);

                }
            }
            res.add(level);
        }
        return res;
    }
}
// @lc code=end




/*Problem 102 asks for **level order traversal** of a binary tree: return values level by level from top to bottom.

For example, tree `[3,9,20,null,null,15,7]` means:

```text
    3
   / \
  9  20
    /  \
   15   7
```

Expected output:
```text
[[3],[9,20],[15,7]]
```

In your file 102.binary-tree-level-order-traversal.java, the logic is correct now.

1. `res` stores final answer (`List<List<Integer>>`).
2. If `root == null`, return empty `res`.
3. Use a queue `q` for BFS.
4. Push `root` first.
5. While queue not empty:
   1. Take `size = q.size()` (this is number of nodes in current level).
   2. Create `level = new ArrayList<>()`.
   3. Run loop `size` times:
      1. Pop one node.
      2. Add its value to `level`.
      3. Push its children (left, right) into queue.
   4. After loop ends, add `level` to `res`.

Important point:
- `res.add(level)` must be **outside** the inner `for` loop.
- If placed inside, the same level can be added multiple times incorrectly.

Dry run on the example:

1. Start: `q=[3]`, `res=[]`
2. Level 1:
   1. `size=1`
   2. Pop `3`, `level=[3]`, push `9,20`
   3. Add level -> `res=[[3]]`, queue becomes `[9,20]`
3. Level 2:
   1. `size=2`
   2. Pop `9`, `level=[9]`
   3. Pop `20`, `level=[9,20]`, push `15,7`
   4. Add level -> `res=[[3],[9,20]]`, queue `[15,7]`
4. Level 3:
   1. `size=2`
   2. Pop `15`, `level=[15]`
   3. Pop `7`, `level=[15,7]`
   4. Add level -> `res=[[3],[9,20],[15,7]]`

Queue becomes empty, return result.

Complexity:
- Time: `O(n)` (every node processed once)
- Space: `O(n)` (queue + result) */