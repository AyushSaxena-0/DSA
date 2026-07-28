public class O240Leetcode_108_Convert_Sorted_Array_To_Height_Balanced_BST {
    public static TreeNode helper(int[]nums,int start,int end){
        if(start>end)return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,start,mid-1);
        root.right=helper(nums,mid+1,end);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        //Look the trick is always take the middle element of array as root to build a height balanced BST
        return helper(nums,0,nums.length-1);
    }
    public static void printTree(TreeNode root){
        if(root==null)return;
        System.out.print(root.val+" ");
        printTree(root.left);
        printTree(root.right);
    }

    static void main() {

        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        printTree(root);
    }
}
