package solutions.trees;

import solutions.utils.TreeNode;

/**
 * #543 - Diameter of Binary Tree
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/diameter-of-binary-tree
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * Example 2:
 *
 * Input: root = [1,2]
 * Output: 1
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 104].
 * -100 <= Node.val <= 100
 *
 */
public class P543_Diameter_of_Binary_Tree {


    /**
     *         1
     *        / \
     *       2   3
     *      / \
     *     4   5
     *
     *     Node 4:
     * left=0, right=0
     * maxDiameter = max(0, 0+0) = 0
     * returns height 1
     *
     * Node 5:
     * left=0, right=0
     * maxDiameter = max(0, 0+0) = 0
     * returns height 1
     *
     * Node 2:
     * left=1, right=1
     * maxDiameter = max(0, 1+1) = 2  ⬅️ updated!
     * returns height 2
     *
     * Node 3:
     * left=0, right=0
     * maxDiameter = max(2, 0+0) = 2  (no change)
     * returns height 1
     *
     * Node 1:
     * left=2, right=1
     * maxDiameter = max(2, 2+1) = 3  ⬅️ updated!
     * returns height 3
     *
     * final answer: 3 ✅
     *
     */
    int maxDiameter = 0;

    public int height(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftHeight   = height(root.left);
        int rightHeight  = height(root.right);
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return Math.max(leftHeight  , rightHeight) +1;
    }

    //Input: root = [1,2,3,4,5]
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        new P543_Diameter_of_Binary_Tree().diameterOfBinaryTree(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)));
    }

}
