package solutions.trees;

import solutions.utils.TreeNode;

/**
 * #572 - Subtree of Another Tree
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/subtree-of-another-tree
 *
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure
 * and node values of subRoot and false otherwise.
 *
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * Output: false
 *
 *
 * Constraints:
 *
 * The number of nodes in the root tree is in the range [1, 2000].
 * The number of nodes in the subRoot tree is in the range [1, 1000].
 * -104 <= root.val <= 104
 * -104 <= subRoot.val <= 104
 *
 */
public class P572_Subtree_of_Another_Tree {
    public boolean isSametree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }
        if(root == null || subRoot == null) {
            return false;
        }
        if(root.val != subRoot.val) {
            return false;
        }
        return isSametree(root.left, subRoot.left)
                && isSametree(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        return isSametree(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    //root = [3,4,5,1,2], subRoot = [4,1,2]
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                    new TreeNode(4,
                            new TreeNode(1), new TreeNode(2)),
                    new TreeNode(5));
        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));


        new P572_Subtree_of_Another_Tree().isSubtree(root, subRoot);
    }
}
