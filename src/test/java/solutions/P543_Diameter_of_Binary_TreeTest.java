package solutions;

import org.junit.jupiter.api.Test;
import solutions.trees.P543_Diameter_of_Binary_Tree;
import solutions.utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P543_Diameter_of_Binary_TreeTest {

    private final P543_Diameter_of_Binary_Tree solution = new P543_Diameter_of_Binary_Tree();

    @Test
    void case1() {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));


        assertEquals(3, solution.diameterOfBinaryTree(treeNode));
    }

    @Test
    void case2() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);


        assertEquals(1, solution.diameterOfBinaryTree(treeNode));
    }
}
