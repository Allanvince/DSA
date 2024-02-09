class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
    }
}

public class BalanceBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        // Check if the height of left and right subtrees differ by more than 1
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        // Recursively check if left and right subtrees are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    // Function to calculate the height of a tree
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate height of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the height of the tree rooted at this node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Example input: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);cd
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BalanceBinaryTree solution = new BalanceBinaryTree();
        boolean isBalanced = solution.isBalanced(root);
        System.out.println("Is the binary tree balanced? " + isBalanced);
    }
}
