package solutions.trees;

import solutions.utils.TreeNode;

/**
 * #110 - Balanced Binary Tree
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/balanced-binary-tree
 *
 * Given a binary tree, determine if it is height-balanced.
 * (A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.)
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * Example 3:
 *
 * Input: root = []
 * Output: true
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 *
 */
public class P110_Balanced_Binary_Tree {
    public int height(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftHeight   = height(root.left);
        int rightHeight  = height(root.right);

        if(leftHeight - rightHeight < -1
                || leftHeight - rightHeight > 1
                || leftHeight == -1
                || rightHeight == -1) {
            return -1;
        }else {
            return Math.max(leftHeight  , rightHeight) +1;
        }

    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

}
