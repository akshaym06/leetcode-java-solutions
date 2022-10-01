package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {
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

    public static int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return 0;

        int level = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            level++;
            for(int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();

                if(node.left == null && node.right == null) {
                    return level;
                }
                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
            }

        }
        return level;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        System.out.println(minDepth(node));
    }
}
