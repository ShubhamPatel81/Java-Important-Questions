package src.Stack;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node

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

public class  N_ary_Tree_Postorder_Traversal_590{

    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root == null) return ans;

        // Recursive postorder traversal of children
        for(Node child : root.children) {
            postorder(child);
        }

        // Add the root value after visiting all its children
        ans.add(root.val);

        return ans;
    }

    public static void main(String[] args) {
        // Constructing the tree
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

        // Create Solution object and call postorder traversal
        N_ary_Tree_Postorder_Traversal_590 solution = new N_ary_Tree_Postorder_Traversal_590();
        List<Integer> result = solution.postorder(root);

        // Output the result of postorder traversal
        System.out.println(result);  // Output: [5, 6, 3, 2, 4, 1]
    }
}
