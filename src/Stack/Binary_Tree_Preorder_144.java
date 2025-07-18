package src.Stack;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_144 {
    List<Integer> a = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root); // Call the helper function
        return a;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return; // Base case: if the node is null, return
        }
        a.add(root.val); // Add the root node value first (preorder)
        traversal(root.left); // Recur on left subtree
        traversal(root.right); // Recur on right subtree
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Binary_Tree_Preorder_144 solution = new Binary_Tree_Preorder_144();

        // Hardcoded input for binary tree:
        //         1
        //        / \
        //       2   3
        //      /   / \
        //     4   5   6

        TreeNode root = solution.new TreeNode(1); // Root node with value 1
        root.left = solution.new TreeNode(2);     // Left child of root with value 2
        root.right = solution.new TreeNode(3);    // Right child of root with value 3
        root.left.left = solution.new TreeNode(4);  // Left child of node 2 with value 4
        root.right.left = solution.new TreeNode(5); // Left child of node 3 with value 5
        root.right.right = solution.new TreeNode(6); // Right child of node 3 with value 6

        // Perform preorder traversal
        List<Integer> result = solution.preorderTraversal(root);

        // Output the result of preorder traversal
        System.out.println(result); // Output: [1, 2, 4, 3, 5, 6]
    }
}
