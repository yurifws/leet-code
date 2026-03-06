package solutions.trees;

import solutions.utils.TreeNode;

/**
 * #104 - Maximum Depth of Binary Tree
 * Difficulty: Easy
 * Link: leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 *
 * Input: root = [1,null,2]
 * Output: 2
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 104].
 * -100 <= Node.val <= 100
 *
 *
 */
public class P104_Maximum_Depth_of_Binary_Tree {

    /**
     *         3
     *        / \
     *       9  20
     *          / \
     *         15   7
     * maxDepth(9)  → left=0, right=0 → max(0,0)+1 = 1
     * maxDepth(15) → left=0, right=0 → max(0,0)+1 = 1
     * maxDepth(7)  → left=0, right=0 → max(0,0)+1 = 1
     * maxDepth(20) → left=1, right=1 → max(1,1)+1 = 2
     * maxDepth(3)  → left=1, right=2 → max(1,2)+1 = 3 ✅
     */
    public int maxDepth(TreeNode root) {

        // Step 1: What should you return if root is null?
        if(root == null){
            return 0;
        }

        // Step 2: Recursively find the depth of the LEFT subtree
        int left = maxDepth(root.left);

        // Step 3: Recursively find the depth of the RIGHT subtree
        int right = maxDepth(root.right);

        // Step 4: What do you return?
        return Math.max(left, right) + 1;

    }
    // [3,9,20,null,null,15,7]
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));
        new P104_Maximum_Depth_of_Binary_Tree().maxDepth(treeNode);
    }
}
