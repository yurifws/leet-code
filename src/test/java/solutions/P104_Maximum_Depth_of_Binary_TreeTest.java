package solutions;

import org.junit.jupiter.api.Test;
import solutions.trees.P104_Maximum_Depth_of_Binary_Tree;
import solutions.utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P104_Maximum_Depth_of_Binary_TreeTest {

    private final P104_Maximum_Depth_of_Binary_Tree solution = new P104_Maximum_Depth_of_Binary_Tree();

    @Test
    void case1() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));
        assertEquals(3, solution.maxDepth(treeNode));
    }

    @Test
    void case2() {
        TreeNode treeNode = new TreeNode(3, null, new TreeNode(2));
        assertEquals(2, solution.maxDepth(treeNode));
    }
}
