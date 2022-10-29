package binarytree;

public class RecoverBST {
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

    TreeNode firstElement = null;
    TreeNode secondElement = null;
    TreeNode prevElement = null;

    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;

        traverse(root.left);

        if (prevElement != null) {
            if (firstElement == null && prevElement.val >= root.val) {
                firstElement = prevElement;
            }
        }
        if (firstElement != null && prevElement.val >= root.val) {
            secondElement = root;
        }
        prevElement = root;
        traverse(root.right);
    }

    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        RecoverBST bst = new RecoverBST();
        System.out.println("Given BST: ");
        bst.inorder(root);
        System.out.println();
        bst.recoverTree(root);
        System.out.println("Recovered BST: ");
        bst.inorder(root);
    }
}
