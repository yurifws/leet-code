package solutions.trees;

import solutions.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * #226 - Invert Binary Tree
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/invert-binary-tree
 *
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * Example 2:
 *
 *
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 * Example 3:
 *
 * Input: root = []
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 *
 */
public class P226_Invert_Binary_Tree {

    /**
     *         4
     *        / \
     *       2   7
     *      / \ / \
     *     1  3 6  9
     * Step 1 — Null check
     * If root is null, return null immediately. Nothing to invert.
     * Step 2 — Add root to queue
     * queue: [4]
     * Step 3 — Loop iteration 1, poll node 4
     *
     * Swap 4's children: left 2 and right 7 get swapped
     * Add 7 and 2 to the queue (now swapped)
     *
     * queue: [7, 2]
     * tree:
     *         4
     *        / \
     *       7   2
     *      / \ / \
     *     6  9 1  3
     * Step 4 — Loop iteration 2, poll node 7
     *
     * Swap 7's children: left 6 and right 9 get swapped
     * Add 9 and 6 to the queue
     *
     * queue: [2, 9, 6]
     * Step 5 — Loop iteration 3, poll node 2
     *
     * Swap 2's children: left 1 and right 3 get swapped
     * Add 3 and 1 to the queue
     *
     * queue: [9, 6, 3, 1]
     * Step 6 — Remaining iterations
     *
     * Poll 9, 6, 3, 1 one by one — they have no children, so just swap nulls and nothing gets added to the queue
     *
     * Step 7 — Queue is empty, return root
     *         4
     *        / \
     *       7   2
     *      / \ / \
     *     9  6 3  1
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }

        }

        return root;
    }

    // 4,2,7,1,3,6,9
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(9)));

        new P226_Invert_Binary_Tree().invertTree(treeNode);
    }
}
