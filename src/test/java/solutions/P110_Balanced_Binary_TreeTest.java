package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.trees.P110_Balanced_Binary_Tree;
import solutions.utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P110_Balanced_Binary_TreeTest {

    private final P110_Balanced_Binary_Tree solution = new P110_Balanced_Binary_Tree();

    //[3,9,20,null,null,15,7]
    @Test
    void case1() {

        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9,
                        null, null),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));

        assertTrue(solution.isBalanced(treeNode));
    }

    //[1,2,2,3,3,null,null,4,4]
    @Test
    void case2() {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2,
                        null, null));
        assertFalse(solution.isBalanced(treeNode));
    }

    //[]
    @Test
    void case3() {
        assertTrue(solution.isBalanced(new TreeNode()));

    }
}
