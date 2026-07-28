public class O241Leetcode_112_Path_Sum {
    public static boolean helper(TreeNode root, int currentSum, int target) {
        if (root == null) return false;
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == target;
        }
        return helper(root.left, currentSum, target)||helper(root.right, currentSum, target);
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
    }

    static void main() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        System.out.println(hasPathSum(root, targetSum));
    }
}
