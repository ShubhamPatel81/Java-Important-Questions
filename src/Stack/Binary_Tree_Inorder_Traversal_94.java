package src.Stack;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helps(res, root);
        return res;
    }
    void helps(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        helps(res, root.left);
        res.add(root.val);
        helps(res, root.right);
    }

    public static void main(String[] args) {
        Binary_Tree_Inorder_Traversal_94 solution = new Binary_Tree_Inorder_Traversal_94();


        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);


        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);
    }

}
