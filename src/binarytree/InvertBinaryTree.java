package binarytree;

public class InvertBinaryTree {
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

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        final TreeNode left = root.left;
        final TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }
}
