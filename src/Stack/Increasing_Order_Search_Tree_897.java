package src.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Increasing_Order_Search_Tree_897 {
    TreeNode current = new TreeNode(0);  // Dummy node to act as a placeholder

    // Helper method to perform in-order traversal
    public void helper(TreeNode node) {
        if (node == null) return;  // Base case for recursion

        // In-order traversal: Left -> Node -> Right
        helper(node.left);  // Visit left subtree

        // Set current node's left to null and attach current node to the right
        node.left = null;  // Nullify the left pointer
        current.right = node;  // Attach the node to the current node's right
        current = node;  // Move the current pointer to the node

        helper(node.right);  // Visit right subtree
    }

    // Function to transform the tree to increasing order search tree
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = current;  // Store the dummy node
        helper(root);  // Start in-order traversal and transformation
        return ans.right;  // Return the new root (ans.right skips the dummy node)
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);

        Increasing_Order_Search_Tree_897 solution = new Increasing_Order_Search_Tree_897();
        TreeNode result = solution.increasingBST(root);
        System.out.println("The Final Asswer is : ");
        // Output the result (in-order traversal)
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.right;
        }
    }
}
