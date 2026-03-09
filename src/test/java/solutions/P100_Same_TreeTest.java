package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.trees.P100_Same_Tree;
import solutions.utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P100_Same_TreeTest {

    private final P100_Same_Tree solution = new P100_Same_Tree();

    //p = [1,2,3], q = [1,2,3]
    @Test
    void case1() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        assertTrue(solution.isSameTree(p, q));
    }

    //p = [1,2], q = [1,null,2]
    @Test
    void case2() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                null);
        TreeNode q = new TreeNode(1,
                null,
                new TreeNode(2));
        assertFalse(solution.isSameTree(p, q));
    }

    //p = [1,2,1], q = [1,1,2]
    @Test
    void case3() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(1));
        TreeNode q = new TreeNode(1,
                new TreeNode(1),
                new TreeNode(2));
        assertFalse(solution.isSameTree(p, q));
    }
}
