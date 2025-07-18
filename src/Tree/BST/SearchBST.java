package src.Tree.BST;

// Internal class (NOT public)
class TreeNode {
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

// Main public class (file name must be SearchBST.java)
public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        else if (root.val > val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        // Construct a sample BST
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);

        node2.left = node1;
        node2.right = node3;
        node4.left = node2;
        node4.right = node7;

        // Search in BST
        SearchBST search = new SearchBST();
        TreeNode result = search.searchBST(node4, 3);

        if (result != null)
            System.out.println("Found node with value: " + result.val);
        else
            System.out.println("Value not found in BST");
    }
}
