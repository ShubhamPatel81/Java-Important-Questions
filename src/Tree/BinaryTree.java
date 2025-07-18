package src.Tree;



class Node{
    int key;
    Node left;
    Node right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class BinaryTree {

    Node root;

    public void  InOrdertreverseTree(Node node){
        if (node != null){
            InOrdertreverseTree(node.left);
            System.out.print(" "+node.key);
            InOrdertreverseTree(node.right);
        }
    }
    public void postOrder(Node node){
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.key);
        }
    }
    public void preOrder(Node node ){
        if (node != null){
            System.out.print(" "+ node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);


        System.out.println("Inorder Traversal : ");
        tree.InOrdertreverseTree(tree.root);


        System.out.println();
        System.out.println("PostOrder Traversal : ");
        tree.postOrder(tree.root);

        System.out.println();
        System.out.println("Pre-Order Traversal : ");
        tree.preOrder(tree.root);
    }
}
