public class O237Leetcode_101_Symmetric_Tree {
    public static boolean helper(TreeNode left,TreeNode right){
        //This is checking basically the mirror image
        //Creating base conditions in recursion
        if(left==null&&right==null)return true;
        else if(left==null||right==null)return false;
        else if(left.val!=right.val)return false;
        //This is the crux of the recursion
        //Since it is mirror image so use those properties of mirror
        return helper(left.left,right.right)&&helper(left.right,right.left);

    }
    public static boolean isSymmetric(TreeNode root) {
        //Using Recursion I am going to solve this problem
        //I am creating a function with left and right as input which checks if both are mirror image of each other or not
        if(root==null)return true; //Trivial case if root is null it is a symmetric tree
        return helper(root.left,root.right);//This is a helper function

    }

    static void main() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        System.out.println(isSymmetric(t1));
    }
}
