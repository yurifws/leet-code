package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.trees.P226_Invert_Binary_Tree;
import solutions.utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P226_Invert_Binary_TreeTest {

    private final P226_Invert_Binary_Tree solution = new P226_Invert_Binary_Tree();

    @Test
    void case1() {
        TreeNode treeNode = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(9)));


        TreeNode actual = solution.invertTree(treeNode);

        assertEquals(4, actual.val);
        assertEquals(7, actual.left.val);
        assertEquals(9, actual.left.left.val);
        assertEquals(6, actual.left.right.val);
        assertEquals(2, actual.right.val);
        assertEquals(3, actual.right.left.val);
        assertEquals(1, actual.right.right.val);

    }

    @Test
    void case2() {
        TreeNode treeNode = new TreeNode(2,
                        new TreeNode(1), new TreeNode(3));


        TreeNode actual = solution.invertTree(treeNode);

        assertEquals(2, actual.val);
        assertEquals(3, actual.left.val);
        assertEquals(1, actual.right.val);
    }

    @Test
    void case3() {
        TreeNode treeNode = new TreeNode();

        TreeNode actual = solution.invertTree(treeNode);

        assertEquals(treeNode, actual);
    }
}
