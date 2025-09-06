package src.Tree;

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
public class DiameterofBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int maxH[] = new int[1];
        findHeight(root,maxH);
        return maxH[0];
    }
    public static int findHeight(TreeNode root,int[]maxH){
       if (root == null) return 0;
       int leftHeight = findHeight(root.left,maxH);
       int  rightHeight = findHeight(root.right,maxH);
       maxH[0] = Math.max(maxH[0],leftHeight+rightHeight);
       return (1+ Math.max(leftHeight,rightHeight));

    }

    public static void main(String[] args) {
        // Example tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );

        DiameterofBinaryTree sol = new DiameterofBinaryTree();
        System.out.println("Diameter: " + sol.diameterOfBinaryTree(root));
    }

}
