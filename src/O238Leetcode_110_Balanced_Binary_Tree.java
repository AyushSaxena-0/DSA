public class O238Leetcode_110_Balanced_Binary_Tree {
    public static int height(TreeNode root){
        //This is to find height of each Tree
        if(root==null)return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int leftHeight=height(root.left);//height of left subtree
        int rightHeight=height(root.right);//height of right subtree
        //Condition for Balanced Binary Tree is leftheight-rightheight<=1
        if(Math.abs(leftHeight-rightHeight)>1)return false;
        //This is to check for each subtree
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(isBalanced(root));
    }
}
