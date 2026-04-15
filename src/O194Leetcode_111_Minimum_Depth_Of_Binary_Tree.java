public class O194Leetcode_111_Minimum_Depth_Of_Binary_Tree {
    public static int ans(TreeNode root){
        if (root == null) return 0;
        // If left is null, go right
        if (root.left == null) {
            return 1 + ans(root.right);
        }
        // If right is null, go left
        if (root.right == null) {
            return 1 + ans(root.left);
        }
        // If both exist, take min
        return 1 + Math.min(ans(root.left), ans(root.right));
    }
    public static int minDepth(TreeNode root) {
        return ans(root);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(minDepth(root));
    }
}
