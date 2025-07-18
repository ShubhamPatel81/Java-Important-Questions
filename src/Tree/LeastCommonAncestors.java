package src.Tree;

public class LeastCommonAncestors {


    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static Node leastAncestor(Node root,Node p, Node q){

        if (p.value > root.value && q.value> root.value ){
          return   leastAncestor(root.right, p, q);
        }
        else if (p.value < root.value && q.value< root.value ){
            return leastAncestor(root.left, p, q);
        }
        else if (p.value == root.value  || q.value == root.value) return root;
        else return root;

    }


    public static void main(String[] args) {
        // Build the tree
        Node node4 = new Node(4);
        Node node2 = new Node(2);
        Node node7 = new Node(7);
        Node node1 = new Node(1);
        Node node3 = new Node(3);

        node2.left = node1;
        node2.right = node3;
        node4.left = node2;
        node4.right = node7;

        // Create an object to call the non-static method
        LeastCommonAncestors tree = new LeastCommonAncestors();
        System.out.println("In-order traversal of the tree:");
        tree.traverseInOrder(node4);

        System.out.println();

        System.out.println("Least Common Ancestors : ");
        Node val = leastAncestor(node4, node1,node7);
        System.out.println(val.value);

    }
}
