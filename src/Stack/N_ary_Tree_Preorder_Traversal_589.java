package src.Stack;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class N_ary_Tree_Preorder_Traversal_589 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return ans;

        ans.add(root.val);  // Visit the root node

        // Recursively visit all the children
        for (Node child : root.children) {
            preorder(child);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example tree:
        //         1
        //       / | \
        //      3  2  4
        //     / \
        //    5   6

        Node child1 = new Node(5);
        Node child2 = new Node(6);
        List<Node> childrenOf3 = new ArrayList<>();
        childrenOf3.add(child1);
        childrenOf3.add(child2);

        Node node3 = new Node(3, childrenOf3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        List<Node> childrenOf1 = new ArrayList<>();
        childrenOf1.add(node3);
        childrenOf1.add(node2);
        childrenOf1.add(node4);

        Node root = new Node(1, childrenOf1); // Root node with value 1

        N_ary_Tree_Preorder_Traversal_589 solution = new N_ary_Tree_Preorder_Traversal_589();
        List<Integer> result = solution.preorder(root);

        // Output the result of preorder traversal
        System.out.println(result);  // Output: [1, 3, 5, 6, 2, 4]
    }
}
