package binarytree;

import java.util.ArrayList;
import java.util.List;

public class TreePaths {
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

    public static List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return res;

        treePath(root, new StringBuilder());
        return res;
    }

    static List<String> res = new ArrayList<>();

    public static void treePath(TreeNode root, StringBuilder sb) {
        if (root == null)
            return;
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            treePath(root.left, sb);
            treePath(root.right, sb);
        }
        sb.setLength(len);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> ans = binaryTreePaths(root);
        System.out.println(ans);
    }
}
