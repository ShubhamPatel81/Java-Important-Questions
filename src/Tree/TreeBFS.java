package src.Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeBFS {

    class TreeNode<E>{
        E data;
        TreeNode left;
        TreeNode right;
        public TreeNode(TreeNode left, TreeNode right,E data){
                this.data=data;
                this.left =null;
                this.right=null;
        }
    }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null) return res;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size(); // number of nodes in this level
//            List<Integer> level = new ArrayList<>();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                level.add(node.val);
//
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//            }
//            res.add(level);
//        }
//        return res;
//    }
    public ArrayList<Integer> BFS(TreeNode<Integer> root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
             TreeNode<Integer> node = queue.poll();
             res.add(node.data);
             if (node.left!=null){
                 queue.offer(node.left);
             }
             if (node.right!=null){
                queue.offer(node.right);
             }
        }


        return res;
    }
    public static void main(String[] args) {

    }
}
