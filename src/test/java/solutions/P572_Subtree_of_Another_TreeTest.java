package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.trees.P100_Same_Tree;
import solutions.trees.P572_Subtree_of_Another_Tree;
import solutions.utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class P572_Subtree_of_Another_TreeTest {

    private final P572_Subtree_of_Another_Tree solution = new P572_Subtree_of_Another_Tree();

    //root = [3,4,5,1,2], subRoot = [4,1,2]
    @Test
    void case1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));


        assertTrue(solution.isSubtree(root, subRoot));
    }

    ////root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
    @Test
    void case2() {
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1,
                                null, new TreeNode(0)),
                        new TreeNode(2)),
                new TreeNode(5));

        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));


        assertFalse(solution.isSubtree(root, subRoot));
    }

}
