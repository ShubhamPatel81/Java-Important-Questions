package src.Stack;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node1 {
    public int val;
    public List<Node1> children;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node1(int _val, List<Node1> _children) {
        val = _val;
        children = _children;
    }
}

public class N_ary_Tree_Preorder_Traversal_589 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorder(Node1 root) {
        if (root == null) return ans;

        ans.add(root.val);  // Visit the root node

        // Recursively visit all the children
        for (Node1 child : root.children) {
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

        Node1 child1 = new Node1(5);
        Node1 child2 = new Node1(6);
        List<Node1> childrenOf3 = new ArrayList<>();
        childrenOf3.add(child1);
        childrenOf3.add(child2);

        Node1 node3 = new Node1(3, childrenOf3);
        Node1 node2 = new Node1(2);
        Node1 node4 = new Node1(4);

        List<Node1> childrenOf1 = new ArrayList<>();
        childrenOf1.add(node3);
        childrenOf1.add(node2);
        childrenOf1.add(node4);

        Node1 root = new Node1(1, childrenOf1); // Root node with value 1

        N_ary_Tree_Preorder_Traversal_589 solution = new N_ary_Tree_Preorder_Traversal_589();
        List<Integer> result = solution.preorder(root);

        // Output the result of preorder traversal
        System.out.println(result);  // Output: [1, 3, 5, 6, 2, 4]
    }
}
