package src.Tree;

public class CountTheNodeInCompleteBinaryTree {

    // Private inner class, usable only inside this outer class
    private class TreeNode {
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

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = findLeftHeight(root);
        int rightHeight = findRightHeight(root);

        if (leftHeight == rightHeight) {
            return (int) Math.pow(2, leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private static int findLeftHeight(TreeNode root) {
        int count = 1;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    private static int findRightHeight(TreeNode root) {
        int count = 1;
        while (root.right != null) {
            count++;
            root = root.right;
        }
        return count;
    }

    public static void main(String[] args) {
        CountTheNodeInCompleteBinaryTree outer = new CountTheNodeInCompleteBinaryTree();

        // ✅ Need outer instance to create inner class instance
        TreeNode root = outer.new TreeNode(1);
        root.left = outer.new TreeNode(2);
        root.right = outer.new TreeNode(3);
        root.left.left = outer.new TreeNode(4);
        root.left.right = outer.new TreeNode(5);

        System.out.println("Total nodes: " + countNodes(root));
    }
}
