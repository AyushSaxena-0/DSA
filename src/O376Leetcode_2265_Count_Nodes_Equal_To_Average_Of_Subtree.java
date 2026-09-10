public class O376Leetcode_2265_Count_Nodes_Equal_To_Average_Of_Subtree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    static int ans = 0;

    public static int[] helper(TreeNode root) {
        if (root == null) {
            //{sum,nodes}
            return new int[]{-1, -1};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int sum = root.val + left[0] + right[0];
        int count = 1 + left[1] + right[1];
        if (root.val == ((sum) / count)) ans++;

        return new int[]{sum, count};

    }

    public static int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(8);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        System.out.println(averageOfSubtree(root));
    }

}