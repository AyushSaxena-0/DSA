public class O200Leetcode_226_Invert_Binary_Tree {
    public static TreeNode invertTree(TreeNode root) {
        //Using classic recursion
        if(root==null){
            return root;
        }
        //Left subtree is inverted
        invertTree(root.left);
        //Right subtree is inverted
        invertTree(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;

    }
    static void print(TreeNode root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.left.left=new TreeNode(8);
        root.left.left.right=new TreeNode(9);
        root.left.right.left=new TreeNode(10);
        System.out.println("Before:");
        print(root);

        System.out.println("\nAfter:");
        invertTree(root);
        print(root);
    }
}
