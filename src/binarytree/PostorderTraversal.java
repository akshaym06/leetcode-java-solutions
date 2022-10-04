package binarytree;

import java.util.LinkedList;
import java.util.List;

public class PostorderTraversal {
    public static class TreeNode {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new LinkedList<Integer>();
        if(root==null)
            return postorder;
        postorder.addAll(postorderTraversal(root.left));
        postorder.addAll(postorderTraversal(root.right));
        postorder.add(root.val);
        return postorder;
    }
}
