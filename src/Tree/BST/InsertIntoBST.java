package src.Tree.BST;

public class InsertIntoBST {
    public static class TreeNode {   // 👈 make it static & public so Main can use it
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (root.val > val) {
            if (root.left == null) root.left = new TreeNode(val);
            else insertIntoBST(root.left, val);
        } else if (root.val < val) {
            if (root.right == null) root.right = new TreeNode(val);
            else insertIntoBST(root.right, val);
        }

        return root;
    }


    public class Main {
        public static void main(String[] args) {
            InsertIntoBST sol = new InsertIntoBST();

            // 👇 Use InsertIntoBST.TreeNode
            InsertIntoBST.TreeNode root = new InsertIntoBST.TreeNode(4);
            root.left = new InsertIntoBST.TreeNode(2, new InsertIntoBST.TreeNode(1), new InsertIntoBST.TreeNode(3));
            root.right = new InsertIntoBST.TreeNode(7);

            // insert new value
            root = sol.insertIntoBST(root, 5);

            // print inorder traversal to check result
            inorder(root);
        }

        static void inorder(InsertIntoBST.TreeNode root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
}